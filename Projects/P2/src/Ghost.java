import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
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

	public boolean move() {
		ArrayList<Location> moveChoices = get_valid_moves();
		if (moveChoices != null && !moveChoices.isEmpty()) {
			// Move at random
			int sz = moveChoices.size();
			int rand = (int) Math.floor(Math.random() *(sz ));
			
			Location selected = moveChoices.get(rand);
			
			this.myLoc.shift(selected.x, selected.y);
			
			this.myMap.move(this.myName, selected, Map.Type.GHOST);
		
			return true;
		} else {
			return false;
		}
	}

	public boolean is_pacman_in_range() { 
    return false;
	}

	public boolean attack() {
		return false;
	}
}
