package server;

import java.io.*;
import java.net.*;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ServerThread extends Thread {
	Socket socket = null;
	ServerThread(Socket socket){
		this.socket = socket;
	}
	
	
	public void run(){
		client.Game game = null;

		try{	
			ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
			while ((game = (client.Game)objectInputStream.readObject()) != null){
			System.out.println(game.toSTring());
			
			doSomething(game);
			objectOutputStream.writeObject(game);
			
			
			
			System.out.println("Object has been changed and sent.");
			
			}
			socket.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
	}

	private void doSomething (client.Game game){
		game.setPlayer("Alen");
		game.setAge(25);
	}

}
