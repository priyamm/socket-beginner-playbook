package com.priyam.tcp;

import java.io.*;
import java.net.Socket;

public class ServerSocket {

	public static void main(String[] args) throws IOException {
		java.net.ServerSocket serverSocket = new java.net.ServerSocket(1025);
		System.out.println("Server is Up");

		System.out.println("Server is waiting for client to be connected");
		Socket socket = serverSocket.accept();
		System.out.println("Client is connected");

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("Request from Client: " + bufferedReader.readLine());

//		System.out.println("sending message sent to client");
//		String name = "Priyam's Server";
//		PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
//		writer.write(name);
//		writer.flush();
//		System.out.println("Message sent to client");

	}
}
