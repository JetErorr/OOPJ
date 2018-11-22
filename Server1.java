import java.io.*;
import java.net.*;

class Server1 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(7777);
        Socket s = ss.accept();

        System.out.println("Connection Established.!");

        OutputStream obj = s.getOutputStream();
        PrintStream ps = new PrintStream(obj);

        InputStream obji = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(obji));

        String str = "Hello Client.!";
        ps.println(str);
        ps.println("This is IT Division.!");
        ps.println("Bye");
        ps.println("What is happening.?");
        ps.print(".");
        String str1;
        while ((str1 = br.readLine()) != null) {
            System.out.println("From Client: " + str1);
        }
        br.close();
        ps.close();
        ss.close();
        s.close();
    }
}