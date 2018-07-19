package Lesson6.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CatchClient extends Thread{
    Server server;
    Socket socket;
    //DataInputStream in;
    //DataOutputStream out;
    Scanner in;
    PrintWriter out;

    public CatchClient(Server server,Socket socket) {
        this.server = server;
        this.socket = socket;
    }

    @Override
    public void run() {
        try {

            in = new Scanner(socket.getInputStream());
            out = new PrintWriter(socket.getOutputStream(),true);

            while (true){
                String str = in.nextLine();
                if (str.equals("/end")) {
                    sendMsg("/serverClosed");
                    break;
                }
                server.msgAll(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendMsg(String msg){
            out.println(msg);
    }



}
