package com.priyam.udp;

import java.io.IOException;
import java.net.*;
import java.util.Arrays;

public class ClientSocket {

	public static void main(String[] args) throws IOException {
		DatagramSocket clientSocket = new DatagramSocket();

		String message = "Message";
		byte[] data = message.getBytes();
		DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 1026);
		System.out.println("sending data to server");
		clientSocket.send(packet);
		System.out.println("sent data to server");

		byte dataResponse[] = new byte[1024];
		DatagramPacket responsePacket = new DatagramPacket(dataResponse, dataResponse.length);
		clientSocket.receive(responsePacket);
		System.out.println("Message received from server: " + new String(dataResponse).trim());
	}
}
