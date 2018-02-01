package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSocket {
	public static void main(String[] args) {
		try {
			ServerSocket socket = new ServerSocket(5555);
			Socket s = socket.accept();
			DataInputStream in  = new DataInputStream(s.getInputStream());
			System.out.println(in.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
