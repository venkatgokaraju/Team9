import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc {
	
	public void testMapGetLoc() {
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(11,11);
		Location c1 = new Location(1,5);
		Location w1 = new Location(30,30);
		Location e1 = new Location(2, 5);

		frame1.addPacMan(p1);
		frame1.addGhost(g1, "clyde", Color.red);

		Map map1 = frame1.getMap();
		Ghost ghost1 = new Ghost("clyde", g1, map1);
		PacMan pacman1 = new PacMan("boo", p1, map1);

		System.out.println(map1.getLoc(p1));

	}
}
