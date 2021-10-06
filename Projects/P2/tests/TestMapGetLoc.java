import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc {
	
	public void testMapGetLoc() {
		Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
		Ghost ghost = frame.addGhost(new Location(x, y), "name", Color.red); //Creates a red ghost named "name" at location x,y
		frame.initPlayers(); //Creates all of the players
		frame.startGame();



	}
}
