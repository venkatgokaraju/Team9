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
		// Liam Code
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
			System.out.println("Rand:" + rand);
			
			this.myLoc.shift(selected.x, selected.y);
			
//			Map.move(myName, selected, Map.Type.PACMAN);
		
			return true;
		} else {
			return false;
		}
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
