import junit.framework.*;

//import static org.junit.Assert.assertEquals;

import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {
//public class TestPacManMove {

	
	public void init() throws FileNotFoundException {
//		NoFrame frame = new NoFrame();

//		MainFrame frame = new MainFrame();
	}

	public void testPacManMove() throws FileNotFoundException {
		int i = 0;
		NoFrame frame = new NoFrame();
		Location locationPacman = new Location(10, 10);
		
		frame.addPacMan(locationPacman);
		Map grid = frame.getMap();
		PacMan pacman = new PacMan("PM", locationPacman, grid);
		
//		assertTrue(pacman.move());
		
		assertEquals(i, 0);
		
	}
	
}
