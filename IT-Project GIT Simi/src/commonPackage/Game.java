package commonPackage;

import java.awt.TextField;
import java.io.Serializable;

import clientPackage.GameController;

public class Game implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7256818121716104173L;
	private Player[] players;
	private int numOfPlayers;
	private String gameName;
	private GameController gameController;
	
	
	

	
	public Game(Session session){
		this.players = session.getPlayers();
		this.numOfPlayers = session.getNumOfPlayers();
		this.gameName = session.getSessionName();
		this.gameController = new GameController();
	}
	
		
		
	public String toSTring(){
		return "Player name: "+players;
	}
	

}
