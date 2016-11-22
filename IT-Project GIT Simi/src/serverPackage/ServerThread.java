package serverPackage;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import commonPackage.Player;

public class ServerThread extends Thread {
	Socket socket = null;
	ServerThread(Socket socket){
		this.socket = socket;
	}


	public void run(){
		commonPackage.Game game = null;

		try{
			//schreibt alle User in File in eine ArrayList
			//WICHTIG: müssen wenn Spiel beendet wurde wieder in File geschrieben werden
			Scanner scan = new Scanner(new File("RegisteredPlayers.txt"));
			ArrayList<Player> regPlayers = new ArrayList<Player>();

			while(scan.hasNextLine()){
				String[] next = scan.nextLine().split(":");
				String[] d = next[2].split("-");
				Date date = new Date(Integer.parseInt(d[2]), Integer.parseInt(d[1]), Integer.parseInt(d[0]));
				regPlayers.add(new Player(next[0], next[1], date));
			}

			ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
			while ((game = (commonPackage.Game)objectInputStream.readObject()) != null){
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

	private void doSomething (commonPackage.Game game){
		System.out.println("nothing in method");
	}

}
