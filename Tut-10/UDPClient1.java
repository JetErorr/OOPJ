import java.net.*;
import java.util.Scanner;

class UDPClient1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket mySocket = new DatagramSocket(7778);
        byte myBuffer[] = new byte[2000];
        while (true) {
            DatagramPacket dataPacket = new DatagramPacket(myBuffer, myBuffer.length,
                    InetAddress.getByName("127.0.0.1"), 8881);
            mySocket.receive(dataPacket);
            String msg = new String(dataPacket.getData(), 0, dataPacket.getLength());
            System.out.println("Message Recieved :--- " + msg);
            if (msg.equals("exit")) {
                break;
            }
        }
        mySocket.close();
    }
}