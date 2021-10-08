import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		NoFrame frame1 = new NoFrame();
		Location c1 = new Location(1,5); // cookie and pacman location here 
		Location noCookie = new Location(29,29); 

		frame1.addPacMan(c1);

		Map map1 = frame1.getMap();
		PacMan pacman1 = new PacMan("pacman", c1, map1);
		PacMan pacman2 = new PacMan("pacman", noCookie, map1);
		PacMan fakePacman = new PacMan("boo", c1, map1);

		System.out.println(map1.getLoc(c1)); // [COOKIE, PACMAN]
		System.out.println(map1.getLoc(noCookie));

		assertNotNull(pacman1.consume());
		assertNull(pacman2.consume());
		assertNull(fakePacman.consume()); 
	}
}
