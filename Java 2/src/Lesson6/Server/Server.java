package Lesson6.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

public class Server {
    int port;
    ServerSocket server;
    private Vector<CatchClient> clients = new Vector<>();

    public Server(int port) {
        this.port = port;

    }

    public void run(){

        try {
            server = new ServerSocket(port);

            System.out.println("Сервер запущен");

            new Thread(new Runnable() {
                @Override
                public void run() {
                    scaner();
                }
            }).start();

            while (true){

                Socket socket = server.accept();
                System.out.println("Клиент подключился");
                CatchClient client = new CatchClient(this,socket);
                client.start();
                clients.add(client);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void msgAll(String msg){
        for (CatchClient c:clients) {
            c.sendMsg(msg);
        }
        System.out.println(msg);
    }

    public void scaner(){
        Scanner in = new Scanner(System.in);
        while (true) {
            String msg = in.nextLine();
            msgAll(msg);
        }
    }

}
