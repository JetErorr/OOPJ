import java.io.*;
import java.net.*;

class Client1 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 7777);

        InputStream obj = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(obj));

        OutputStream obji = s.getOutputStream();
        PrintStream ps = new PrintStream(obji);

        String str;
        int i = 0;
        while ((str = br.readLine()) != null) {
            System.out.println("From Server: " + str);
            if (i++ == 10) {
                break;
            }
        }
        ps.println("Setting fire to our insides, toasty.!");
        s.close();
        br.close();
    }
}