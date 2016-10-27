package game;

import java.io.*;
import java.net.*;

public class Server {
	
	public static final int PORT = 1234;
	
	public static void main(String[] args) throws Exception {
		new Server().runServer();
	}

	public void runServer() throws Exception {
		ServerSocket serverSocket = new ServerSocket (PORT);
		System.out.println("Starting Server...");
		System.out.println("Server started at: "+serverSocket.getInetAddress());
		while(true){
			Socket socket = serverSocket.accept();
			System.out.println("Connection from: "+socket.getInetAddress());
			new ServerThread(socket).start();
		}
		
	}
	

}
