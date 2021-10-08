import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;	
	}

	/*TODO: Check if we need to call the map move function*/
	public boolean move() {
		ArrayList<Location> moveChoices = get_valid_moves();
		if (moveChoices != null && !moveChoices.isEmpty()) {
			// Move at random
			int sz = moveChoices.size();
			int rand = (int) Math.floor(Math.random() *(sz ));
			
			Location selected = moveChoices.get(rand);
			
			this.myLoc.shift(selected.x, selected.y);
			
			this.myMap.move(myName, selected, Map.Type.PACMAN);
		
			return true;
		} else {
			return false;
		}
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	//This method checks to see if there is a 'power-cookie' located in Pacman's current coordinate. 
	//If there is, this method calls the eatCookie method from the Map Class, 
	//and returns the cookie component if the cookie a consumed, and null otherwise.
	public JComponent consume() { 
		if(myMap.getLoc(new Location(myLoc.x, myLoc.y)).contains(Map.Type.COOKIE)) {
			return myMap.eatCookie(myName); 
		}
 		return null;
	}
 }

