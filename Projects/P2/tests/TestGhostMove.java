import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestGhostMove extends TestCase {

	/*copy ghost-isvalid moves and map getLoc*/
	public void testGhostMove() throws FileNotFoundException {
//		MainFrame frame = new MainFrame();
		NoFrame frame = new NoFrame();

		Location locationGhost = new Location(10, 10);
		
		Map grid = frame.getMap();
		
		Ghost ghost = new Ghost("clyde", locationGhost, grid);
		frame.addGhost(locationGhost,"clyde", Color.RED);
		
		assertTrue(ghost.move());

	}
	
	public void testGhostMove2() throws FileNotFoundException {
		/*Iterate due to cover random components*/
		for(int i = 0; i < 100; i++) {
			testGhostMove();
		}
		
	}
	
	public void testGhostMove3() throws FileNotFoundException {
		int scale = 20;
		WallComponent wall1 = new WallComponent(4,4,scale);
		WallComponent wall2 = new WallComponent(5,4,scale);
		WallComponent wall3 = new WallComponent(6,4,scale);
		WallComponent wall4 = new WallComponent(4,5,scale);
		WallComponent wall5 = new WallComponent(6,5,scale);
		WallComponent wall6 = new WallComponent(4,6,scale);
		WallComponent wall7 = new WallComponent(5,6,scale);
		WallComponent wall8 = new WallComponent(6,6,scale);
		
		Location locationWall1 = new Location(4,4);
		Location locationWall2 = new Location(5,4);
		Location locationWall3 = new Location(6,4);
		Location locationWall4 = new Location(4,5);
		Location locationWall5 = new Location(6,5);
		Location locationWall6 = new Location(4,6);
		Location locationWall7 = new Location(5,6);
		Location locationWall8 = new Location(6,6);

				
//		MainFrame frame = new MainFrame();
		NoFrame frame = new NoFrame();

		Location locationGhost = new Location(5, 5);
		
		Map grid = frame.getMap();
		grid.add("wall", locationWall1, wall1, Map.Type.WALL);
		grid.add("wall", locationWall2, wall2, Map.Type.WALL);
		grid.add("wall", locationWall3, wall3, Map.Type.WALL);
		grid.add("wall", locationWall4, wall4, Map.Type.WALL);
		grid.add("wall", locationWall5, wall5, Map.Type.WALL);
		grid.add("wall", locationWall6, wall6, Map.Type.WALL);
		grid.add("wall", locationWall7, wall7, Map.Type.WALL);
		grid.add("wall", locationWall8, wall8, Map.Type.WALL);
//		MainFrame.add(wall1);
		wall1.setLocation(4,4);
		wall2.setLocation(5,4);
		wall3.setLocation(6,4);
		wall4.setLocation(4,5);
		wall5.setLocation(6,5);
		wall6.setLocation(4,6);
		wall7.setLocation(5,6);
		wall8.setLocation(6,6);

		Ghost ghost = new Ghost("clyde", locationGhost, grid);
		frame.addGhost(locationGhost, "clyde", Color.RED);

		assertFalse(ghost.move());

	}
	
	public void testGhostMove4() throws FileNotFoundException {
		/*Iterate due to cover random components*/
		for(int i = 0; i < 100; i++) {
			testGhostMove3();
		}
	}
}
