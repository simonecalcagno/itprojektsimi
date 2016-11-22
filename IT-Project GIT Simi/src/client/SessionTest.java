package client;

public class SessionTest {
	
	public static int sessionID = 0;
	



public SessionTest(){
	this.sessionID = sessionID++;
}

public String toString(){
	return String.valueOf(sessionID);
}

public static void main(String[] args){
	
	SessionTest t1 = new SessionTest();
	
	
	System.out.println(t1);
}

}



