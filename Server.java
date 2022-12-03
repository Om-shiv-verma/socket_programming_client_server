import java.net.*;
import java.io.*;

public class Server {
    public static void main (String [] args)
    {
        ServerSocket s;
        PrintWriter out;
        BufferedReader brc;
        Socket c;
        String msg;
        int a,b;
        try
        {
            s=new ServerSocket(2001);
            c=s.accept();
            System.out.println("Connection Received");
            brc = new BufferedReader(new InputStreamReader(c.getInputStream()));
            out = new PrintWriter(c.getOutputStream(),true);
            System.out.println("Stream fetched for R/W");
            msg=brc.readLine();
            System.out.println("Client info Received");
            a = Integer.parseInt(msg);
            b = a*a*a;
            msg = String.valueOf(b);
            out.println(msg);
            System.out.println("Cube of "+a+" has been sent to client ");
            s.close();
        }catch(Exception e){}
    }
}
