import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket ss =
                new ServerSocket(5000);

        Socket s = ss.accept();

        DataInputStream dis =
                new DataInputStream(s.getInputStream());

        String msg = dis.readUTF();

        System.out.println("Client: " + msg);

        ss.close();
    }
}