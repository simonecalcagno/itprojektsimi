package clientPackage;

import java.net.*;
import java.io.*;

public class Client {
	
	static commonPackage.Player [] playerArray;
	
	commonPackage.Player p1 = new commonPackage.Player("simi", "lala", null);
	commonPackage.Player p2 = new commonPackage.Player("al", "lele", null);
	
	
	public static void main(String[] args) throws Exception{
			System.out.println("Connecting...");
			Socket socket = new Socket ("localhost", serverPackage.Server.PORT);
			System.out.println("Connection successful.");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
			
			BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
			while(true){
	// nur zu test zwecken muss gelöscht werden ab hier sollte ein Game Objekt versendet werden
				
//				System.out.println("Enter you Name and Age...")				
//				String readerInput =bufferedReader.readLine();
//				String[] readerInputTokens = readerInput.split(" ");
//				common.Game clientGame = new common.Game(readerInputTokens[0], Integer.decode(readerInputTokens[1]));
//				System.out.println("Object from Client: \n"+clientGame.toSTring());
				
				commonPackage.Game clientGame = new commonPackage.Game(playerArray);
				
				System.out.println("Sending Object to Server...");
				objectOutputStream.writeObject(clientGame);
				commonPackage.Game serverGame = (commonPackage.Game)objectInputStream.readObject();
				System.out.println("Object changed from Server to: \n"+serverGame.toSTring());	
			}
		}
}

