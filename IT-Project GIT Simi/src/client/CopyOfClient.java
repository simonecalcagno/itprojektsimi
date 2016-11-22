package client;

import java.net.*;
import java.io.*;

public class CopyOfClient {
	
	
	public static void clientServerCommunication() throws Exception{
			System.out.println("Connecting...");
			Socket socket = new Socket ("localhost", server.Server.PORT);
			System.out.println("Connection successful.");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
			
			BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
			while(true){
				System.out.println("Enter you Name and Age...");
				String readerInput =bufferedReader.readLine();
				String[] readerInputTokens = readerInput.split(" ");
				Game clientGame = new Game(readerInputTokens[0], Integer.decode(readerInputTokens[1]));
				System.out.println("Object from Client: \n"+clientGame.toSTring());
				System.out.println("Sending Object to Server...");
				objectOutputStream.writeObject(clientGame);
				Game serverGame = (Game)objectInputStream.readObject();
				System.out.println("Object changed from Server to: \n"+serverGame.toSTring());
			}
		}
}

