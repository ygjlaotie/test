package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClientUdp {
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket pack = new DatagramPacket("���".getBytes(), "���".getBytes().length,InetAddress.getByName("localhost"),9000);
			socket.send(pack);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
