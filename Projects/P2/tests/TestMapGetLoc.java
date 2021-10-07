import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc extends TestCase {
	
	public void testMapGetLoc() throws FileNotFoundException {
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(11,11);
		Location c1 = new Location(1,5);
		Location e1 = new Location(30,30);

		frame1.addPacMan(p1);
		frame1.addGhost(g1, "clyde", Color.red);

		Map map1 = frame1.getMap();
		Ghost ghost1 = new Ghost("clyde", g1, map1);
		PacMan pacman1 = new PacMan("boo", p1, map1);

		System.out.println(map1.getLoc(p1)); //.[PACMAN, WALL]
		System.out.println(map1.getLoc(g1)); // .[GHOST]
		System.out.println(map1.getLoc(e1)); // [EMPTY]
		System.out.println(map1.getLoc(c1)); // [COOKIE]

		MainFrame frame2 = new MainFrame();
		Location p2 = new Location(10,10); //pacman
		Location g2 = new Location(11,11); //ghost
		Location c2 = new Location(1,1); //if col is 1 its cookie location 
		Location e2 = new Location(1,0); // if col is 0, it's wall

		frame2.addPacMan(p2);
		frame2.addGhost(g2, "clyde", Color.red);

		Map map2 = frame2.getMap();
		Ghost ghost2 = new Ghost("clyde", g2, map2);
		PacMan pacman2 = new PacMan("boo", p2, map2);

		System.out.println(map2.getLoc(p2)); //[PACMAN, WALL]
		System.out.println(map2.getLoc(g2)); // [GHOST]
		System.out.println(map2.getLoc(e2)); // [WALL]
		System.out.println(map2.getLoc(c2)); // [COOKIE]
	}
}
