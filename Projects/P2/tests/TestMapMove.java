import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase {

	boolean result1;
	boolean result2;
	// boolean result3;
	// boolean result4;
	// boolean result5;
	protected void setUp() throws Exception  {
		result1 = test1Setup();
		result2 = test2Setup();
		// result3 = test3Setup();
		// result4 = test4Setup();
		// result5 = test5Setup();
	}

	public static boolean test1Setup() throws Exception {
		NoFrame frame1 = new NoFrame();
		
		Location p1 = new Location(10,10);
		PacMan pacman = frame1.addPacMan(p1);

		Location w1 = new Location( 9, 9);
		Location w2 = new Location(10, 9);
		Location w3 = new Location(11, 9);
		Location w4 = new Location( 9,10);
		Location w5 = new Location(11,10);
		Location w6 = new Location( 9,11);
		Location w7 = new Location(10,11);
		Location w8 = new Location(11,11);

		int scale = 20;
		Map map1 = frame1.getMap();
		map1.add("wall1", w1, new WallComponent(w1.x,w1.y,scale), Map.Type.WALL);
		map1.add("wall2", w2, new WallComponent(w2.x,w2.y,scale), Map.Type.WALL);
		map1.add("wall3", w3, new WallComponent(w3.x,w3.y,scale), Map.Type.WALL);
		map1.add("wall4", w4, new WallComponent(w4.x,w4.y,scale), Map.Type.WALL);
		map1.add("wall5", w5, new WallComponent(w5.x,w5.y,scale), Map.Type.WALL);
		map1.add("wall6", w6, new WallComponent(w6.x,w6.y,scale), Map.Type.WALL);
		map1.add("wall7", w7, new WallComponent(w7.x,w7.y,scale), Map.Type.WALL);
		map1.add("wall8", w8, new WallComponent(w8.x,w8.y,scale), Map.Type.WALL);

		return map1.move("pacman", w1, Map.Type.PACMAN) &&
		map1.move("pacman", w2, Map.Type.PACMAN) &&
		map1.move("pacman", w3, Map.Type.PACMAN) &&
		map1.move("pacman", w4, Map.Type.PACMAN) &&
		map1.move("pacman", w5, Map.Type.PACMAN) &&
		map1.move("pacman", w6, Map.Type.PACMAN) &&
		map1.move("pacman", w7, Map.Type.PACMAN) &&
		map1.move("pacman", w8, Map.Type.PACMAN);
	}
	public static boolean test2Setup() throws Exception {
		NoFrame frame1 = new NoFrame();
		
		Location p1 = new Location(10,10);
		PacMan pacman = frame1.addPacMan(p1);

	}
}
