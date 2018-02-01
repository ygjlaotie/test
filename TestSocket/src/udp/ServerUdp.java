package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerUdp {
	public static void main(String[] args) {
		try {
			DatagramSocket server = new DatagramSocket(10000);
			byte[] info = new byte[1024];
			DatagramPacket pack = new DatagramPacket(info, info.length);
			server.receive(pack);
			System.out.println();
			System.out.println(new String(pack.getData(),0,pack.getLength()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
