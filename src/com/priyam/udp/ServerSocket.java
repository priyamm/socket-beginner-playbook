package com.priyam.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServerSocket {
	public static void main(String[] args) throws IOException {
		DatagramSocket serverSocket = new DatagramSocket(1026);
		System.out.println("Server is Up");

		byte[] data = new byte[1024];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		serverSocket.receive(packet);

		System.out.println("Message received from Client: " + new String(data).trim());

		String responseString = new String(data).trim() + ":Received";
		DatagramPacket responsePacket = new DatagramPacket(responseString.getBytes(), responseString.getBytes().length,
				packet.getAddress(), packet.getPort());
		serverSocket.send(responsePacket);
		System.out.println("Message sent to Client");
	}
}
