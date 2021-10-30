import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestAttack extends TestCase {
	boolean result;

	protected void setUp() throws Exception{
		result = test1Setup();
	}

	public static boolean test1Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(28,28);

		frame1.addPacMan(p1);
		frame1.addGhost(g1,"clyde", Color.red);

		Map map1 = frame1.getMap();

		PacMan pac1 = new PacMan("name", p1, map1);
		Ghost ghost1 = new Ghost("clyde", g1, map1);
		
		return ghost1.attack();
	}

	public void testAttack() throws FileNotFoundException{
		assertTrue(result == false);

	}
}