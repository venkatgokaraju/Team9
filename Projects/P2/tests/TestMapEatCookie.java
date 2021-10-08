import junit.framework.*;

import static org.junit.Assert.assertTrue;

import java.awt.Color;
import java.io.*;
import java.util.HashSet;

public class TestMapEatCookie extends TestCase{
	
	public void testMapEatCookie() throws FileNotFoundException {
		MainFrame frame = new MainFrame();
		
		Location locationPacman = new Location(1, 5);
		
		Map grid = frame.getMap();
		
		frame.addPacMan(locationPacman);

		// should contain pacman and cookie
		HashSet<Map.Type> check = new HashSet<>();
		check.add(Map.Type.COOKIE);
		check.add(Map.Type.PACMAN);
		
		assertEquals(grid.getLoc(locationPacman), check);
		grid.eatCookie("pacman");
		check.remove(Map.Type.COOKIE);
		// Should only contain pacman
		assertEquals(grid.getLoc(locationPacman), check);

	}
	
	public void testMapEatCookie2() throws FileNotFoundException {
		MainFrame frame = new MainFrame();
		
		Location locationPacman = new Location(1, 5);
		
		Map grid = frame.getMap();
		
		frame.addPacMan(locationPacman);

		assertEquals(grid.eatCookie(null), null);

	}
	public void testMapEatCookie3() throws FileNotFoundException {
		MainFrame frame = new MainFrame();
		
		Location locationPacman = new Location(1, 5);
		
		Map grid = frame.getMap();
		
		frame.addPacMan(locationPacman);

		assertEquals(grid.eatCookie(""), null);

	}
	
	
}
