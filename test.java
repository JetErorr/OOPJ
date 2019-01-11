import java.net.*;

class Test {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("192.168.91.16");
        address = InetAddress.getByName("www.studytonight.com");
        System.out.println(address);
        InetAddress sw[] = InetAddress.getAllByName("www.google.com");
        for (int i = 0; i < sw.length; i++) {
            System.out.println(sw[i]);
        }
    }
}