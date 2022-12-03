import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        Socket c;
        BufferedReader brc, brs;
        PrintWriter out;
        String msg;
        try {
            c = new Socket("127.0.0.1", 2001);
            System.out.println("Connection Established ");
            out = new PrintWriter(c.getOutputStream(), true);
            brc = new BufferedReader(new InputStreamReader(c.getInputStream()));
            brs = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Connectio Stream fetched");
            System.out.println("Enter any number  ");
            msg = brs.readLine();
            out.println(msg);
            msg = brc.readLine();
            System.out.println("Message Recevied:" + msg);
            c.close();
        } catch (Exception e) {
        }
    }
}