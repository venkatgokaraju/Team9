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
		return null;
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
