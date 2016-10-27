package game;

import java.io.Serializable;

public class Game implements Serializable {
	private static final long serialVersionUID = 3899829800627466047L;
	private String player;
	private int age;
	
	public Game(String player, int age){
		this.player = player;
		this.age = age;
	}
	
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setPlayer(String player){
		this.player = player;
	}
	
	public String getPlayer(){
		return this.player;
	}
	
	public String toSTring(){
		return "Player name: "+getPlayer()+"\nAge: "+String.valueOf(getAge());
	}
	

}
