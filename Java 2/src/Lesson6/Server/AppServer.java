package Lesson6.Server;

public class AppServer {
    static int PORT = 12236;
    public static void main(String[] args) {
        Server s = new Server(PORT);
        s.run();
    }
}
