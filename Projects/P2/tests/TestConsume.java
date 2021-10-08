import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		NoFrame frame1 = new NoFrame();
		Location c1 = new Location(1,5); // cookie and pacman location here 

		frame1.addPacMan(c1);

		Map map1 = frame1.getMap();
		PacMan pacman1 = new PacMan("boo", c1, map1);

		System.out.println(map1.getLoc(c1)); // [COOKIE, PACMAN]

		System.out.println(pacman1.consume()); // returns null 

		assertNotNull(pacman1.consume());

	}
}
