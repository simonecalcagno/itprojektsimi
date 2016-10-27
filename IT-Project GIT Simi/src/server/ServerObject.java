package server;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;


// receives objects from client, replace their names and send it back to client
// needs ObjectOutputStream and ObjectInputStream to send and read Objects
public class ServerObject {
	
	private static int port = 1234;

	public static void main(String[] args) {
		
		
		try{
			ServerSocket server = new ServerSocket(port);
			
			System.out.println("Server auf Port "+port+" gestartet \n"+"Warten auf Client\n");
			
			Socket socket = server.accept();
			
			System.out.println("Client angemeldet");
			
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			
			client.Game game2 = (client.Game)in.readObject();
			
			System.out.println("Objekt beim Server angekommen");
			
			
			game2.setPlayer("dini muetter");
			
			out.writeObject(game2);
			
			System.out.println("Objekt vom Server zur�ckgeschickt! ");
			System.out.println(game2.toSTring());
			
		}catch (Exception e){
			System.out.println("Fehler: "+e);
			
		}
		

	}

}
