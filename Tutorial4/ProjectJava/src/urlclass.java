import java.net.*;

class urlclass{
    public static void main(String[] args) throws Exception{
        URL addr1 = new URL("https://192.168.15.91:8090/auth.html");
        System.out.println("Protocol: "+addr1.getProtocol());
        System.out.println("Port: "+addr1.getPort());
        System.out.println("Host: "+addr1.getHost());
        System.out.println("File: "+addr1.getFile());
        System.out.println("Path: "+addr1.getPath());
        System.out.println("External Form: "+addr1.toExternalForm());
    }
}