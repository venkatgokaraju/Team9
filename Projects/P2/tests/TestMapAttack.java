import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapAttack extends TestCase {

	boolean result1;
	boolean result2;
	boolean result3;
	boolean result4;
	boolean result5;
	boolean result6;
	boolean result7;
	boolean result8;
	boolean result9;
	boolean result10;
	boolean result11;
	boolean result12;
	boolean result13;
	boolean result14;
	boolean result15;
	boolean result16;

	protected void setUp() throws Exception{
		result1 = test1Setup();
		result2 = test2Setup();
		result3 = test3Setup();
		result4 = test4Setup();
		result5 = test5Setup();
		result6 = test6Setup();
		result7 = test7Setup();
		result8 = test8Setup();
		result9 = test9Setup();
		result10 = test10Setup();
		result11 = test11Setup();
		result12 = test12Setup();
		result13 = test13Setup();
		result14 = test14Setup();
		result15 = test15Setup();
		result16 = test16Setup();
	}

	public static boolean test1Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(11,11);
		Location g2 = new Location(12,12);
		Location g3 = new Location(14,14);
		Location g4 = new Location(13,13);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		frame1.addGhost(g2, "Blinky", Color.red);
		frame1.addGhost(g3, "Pinky", Color.red);
		frame1.addGhost(g4, "Inky", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}

	public static boolean test2Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(12,12);
		Location g2 = new Location(12,12);
		Location g3 = new Location(14,14);
		Location g4 = new Location(13,13);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		frame1.addGhost(g2, "Blinky", Color.red);
		frame1.addGhost(g3, "Pinky", Color.red);
		frame1.addGhost(g4, "Inky", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}
	public static boolean test3Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(9,9);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}
	public static boolean test4Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(9,10);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}
	public static boolean test5Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(10,9);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}
	public static boolean test6Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(11,9);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}
	public static boolean test7Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(11,10);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}
	public static boolean test8Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(10,11);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}
	public static boolean test9Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(11,8);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}
	public static boolean test10Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(31,30);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}
	public static boolean test11Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(8,11);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}
	public static boolean test12Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(0,11);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}
	public static boolean test13Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(30,30);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Clyde");
	}
	public static boolean test14Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(11,11);
		Location g2 = new Location(12,12);
		Location g3 = new Location(14,14);
		Location g4 = new Location(13,13);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		frame1.addGhost(g2, "Blinky", Color.red);
		frame1.addGhost(g3, "Pinky", Color.red);
		frame1.addGhost(g4, "Inky", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("blinky");
	}
	public static boolean test15Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(11,11);
		Location g2 = new Location(12,12);
		Location g3 = new Location(14,14);
		Location g4 = new Location(13,13);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		frame1.addGhost(g2, "Blinky", Color.red);
		frame1.addGhost(g3, "Pinky", Color.red);
		frame1.addGhost(g4, "Inky", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("pinky");
	}
	public static boolean test16Setup() throws Exception{
		NoFrame frame1 = new NoFrame();
		Location p1 = new Location(10,10);
		Location g1 = new Location(11,11);
		Location g2 = new Location(12,12);
		Location g3 = new Location(14,14);
		Location g4 = new Location(13,13);
		frame1.addPacMan(p1);
		frame1.addGhost(g1, "Clyde", Color.red);
		frame1.addGhost(g2, "Blinky", Color.red);
		frame1.addGhost(g3, "Pinky", Color.red);
		frame1.addGhost(g4, "Inky", Color.red);
		Map map1 = frame1.getMap();
		return map1.attack("Inky");
	}

	public void testMapAttack1() throws FileNotFoundException{
		assertTrue(result1 == true);
	}
	public void testMapAttack2() throws FileNotFoundException{
		assertTrue(result2 == false);
	}
	public void testMapAttack3() throws FileNotFoundException{
		assertTrue(result3 == true);
	}
	public void testMapAttack4() throws FileNotFoundException{
		assertTrue(result4 == true);
	}
	public void testMapAttack5() throws FileNotFoundException{
		assertTrue(result5 == true);
	}
	public void testMapAttack6() throws FileNotFoundException{
		assertTrue(result6 == true);
	}
	public void testMapAttack7() throws FileNotFoundException{
		assertTrue(result7 == true);
	}
	public void testMapAttack8() throws FileNotFoundException{
		assertTrue(result8 == true);
	}
	public void testMapAttack9() throws FileNotFoundException{
		assertTrue(result9 == false);
	}
	public void testMapAttack10() throws FileNotFoundException{
		assertTrue(result10 == false);
	}
	public void testMapAttack11() throws FileNotFoundException{
		assertTrue(result11 == false);
	}
	public void testMapAttack12() throws FileNotFoundException{
		assertTrue(result12 == false);
	}
	public void testMapAttack13() throws FileNotFoundException{
		assertTrue(result13 == false);
	}
	public void testMapAttack14() throws FileNotFoundException{
		assertTrue(result14 == false);
	}
	public void testMapAttack15() throws FileNotFoundException{
		assertTrue(result15 == false);
	}
	public void testMapAttack16() throws FileNotFoundException{
		assertTrue(result16 == false);
  }
}