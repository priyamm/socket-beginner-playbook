package com.priyam.tcp;

import java.io.*;
import java.net.Socket;

public class ClientSocket {

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket clientSocket = new Socket("localhost", 1025);
        System.out.println("Client is Up");

        String name = "Priyam's Client";
        OutputStreamWriter os = new OutputStreamWriter(clientSocket.getOutputStream());
        PrintWriter writer = new PrintWriter(os);
        writer.write(name);
        os.flush();

//        System.out.println("Waiting for message from server");
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//        System.out.println("Response from Server: " + bufferedReader.readLine());
    }
}
