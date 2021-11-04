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
		
		// not a wall
		int x = this.myLoc.x;
		int y = this.myLoc.y;
		ArrayList<Location> rv = new ArrayList<Location>();

		if ( !myMap.getLoc(new Location(x-1,y-1)).contains(Map.Type.WALL) ) {
			rv.add(new Location(x-1,y-1));
		}
		if ( !myMap.getLoc(new Location( x ,y-1)).contains(Map.Type.WALL) ) {
			rv.add(new Location( x ,y-1));
		}
		if ( !myMap.getLoc(new Location(x+1,y-1)).contains(Map.Type.WALL) ) {
			rv.add(new Location(x+1,y-1)); 
		}
		if ( !myMap.getLoc(new Location(x-1, y )).contains(Map.Type.WALL) ) {
			rv.add(new Location(x-1, y ));
		}
		if ( !myMap.getLoc(new Location(x+1, y )).contains(Map.Type.WALL) ) {
			rv.add(new Location(x+1, y ));
		}
		if ( !myMap.getLoc(new Location(x-1,y+1)).contains(Map.Type.WALL) ) {
			rv.add(new Location(x-1,y+1));
		}
		if ( !myMap.getLoc(new Location( x ,y+1)).contains(Map.Type.WALL) ) {
			rv.add(new Location( x ,y+1));
		}
		if ( !myMap.getLoc(new Location(x+1,y+1)).contains(Map.Type.WALL) ) {
			rv.add(new Location(x+1,y+1));
		}

		return rv;		
	}

	/*TODO: Check if we need to call the map move function*/
	public boolean move() {
		ArrayList<Location> moveChoices = get_valid_moves();
		if (moveChoices != null && !moveChoices.isEmpty()) {
			// Move at random
			int sz = moveChoices.size();
			int rand = (int) Math.floor(Math.random() *(sz ));

			Location selected = moveChoices.get(rand);
			
			this.myLoc = selected; 
			
			this.myMap.move(myName, selected, Map.Type.PACMAN);
		
			return false;
		} else {
			return true;
		}
	}

	public boolean is_ghost_in_range() { 
		if( (myMap.getLoc(new Location(myLoc.x,myLoc.y)).contains(Map.Type.GHOST)) || 
		(myMap.getLoc(new Location(myLoc.x-1,myLoc.y)).contains(Map.Type.GHOST)) ||
		(myMap.getLoc(new Location(myLoc.x+1,myLoc.y)).contains(Map.Type.GHOST)) ||
		(myMap.getLoc(new Location(myLoc.x-1,myLoc.y-1)).contains(Map.Type.GHOST)) ||
		(myMap.getLoc(new Location(myLoc.x+1,myLoc.y-1)).contains(Map.Type.GHOST)) ||
		(myMap.getLoc(new Location(myLoc.x,myLoc.y-1)).contains(Map.Type.GHOST)) ||
		(myMap.getLoc(new Location(myLoc.x-1,myLoc.y+1)).contains(Map.Type.GHOST)) ||
		(myMap.getLoc(new Location(myLoc.x+1,myLoc.y+1)).contains(Map.Type.GHOST)) ||
		(myMap.getLoc(new Location(myLoc.x,myLoc.y+1)).contains(Map.Type.GHOST)) )
			return true;
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

