import java.net.*;
import java.util.Scanner;

class UDPServer1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket mySocket = new DatagramSocket(7785);
        byte myBuffer[];
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter some text here.");
            String msg = scan.nextLine();
            myBuffer = msg.getBytes();
            // URL
            DatagramPacket mypack = new DatagramPacket(myBuffer, myBuffer.length, InetAddress.getByName("10.80.2.2"), 7785);
            mySocket.send(mypack);
            if (msg.equals("exit")) {
                break;
            }
            scan.close();
        }
        mySocket.close();
    }
}