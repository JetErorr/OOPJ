import java.io.IOException;
import java.net.*;
import java.util.Scanner;

class UDPNode1 {
    public static void main(String[] args) {
        DatagramSocket mySocket = new DatagramSocket(1337);
        byte myBuffer[] = new byte[2000];
        while (true) {
            DatagramPacket dataPacket = new DatagramPacket(myBuffer, myBuffer.length,InetAddress.getByName("10.80.2.2"), 7785);
            mySocket.receive(dataPacket);
            String msg = new String(dataPacket.getData(), 0, dataPacket.getLength());
            if (msg.equals("exit")) {
                break;
            }

        }
    }
}