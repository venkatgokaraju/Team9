import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;
import java.util.ArrayList;
public class Map{

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE		
	}
	
	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components; 
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet; 

	private int cookies = 0;

	public Map(int dim){
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}


	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}
		
	public boolean move(String name, Location loc, Type type)  {
		//update locations, components, and field
		//use the setLocation method for the component to move it to the new location
		
		Location startLoc = locations.get(name);
		if (type == Map.Type.PACMAN) {
			PacMan p = new PacMan(name, startLoc, this);
			if (p.get_valid_moves().contains(loc)) {
				// remove type from start location in field
				// add type to new location in field
				field.get(startLoc).remove(type);
				if (field.get(loc) != null) {
					field.get(loc).add(type);
				}
				else {
					HashSet<Type> temp = new HashSet<Type>();
					temp.add(type);
					field.put(loc, temp);
				}

				// setLocation() to new location in components
				components.get(name).setLocation(loc.x, loc.y);

				// remove start location associated with name from locations
				// add (name, new location) pair to locations
				locations.remove(name);
				locations.put(name, loc);
				p.move();
				return false;
			}
		}
		else if (type == Map.Type.GHOST) {
			Ghost g = new Ghost(name, startLoc, this);
			if (g.get_valid_moves().contains(loc)) {
				// remove type from start location in field
				// add type to new location in field
				field.get(startLoc).remove(type);
				if (field.get(loc) != null) {
					field.get(loc).add(type);
				}
				else {
					HashSet<Type> temp = new HashSet<Type>();
					temp.add(type);
					field.put(loc, temp);
				}
				// setLocation to new location in components
				components.get(name).setLocation(loc.x, loc.y);

				// remove start location associated with name from locations
				// add (name, new location) pair to locations
				locations.remove(name);
				locations.put(name, loc);
				g.move();
				return false;
			}
		}
		return true;
	}
	
	public HashSet<Type> getLoc(Location loc) {
		//wallSet and emptySet will help you write this method
		if (loc.x > dim || loc.y > dim || loc.x == 0 || loc.y == 0){
			return wallSet;
		}
			if (field.get(loc).size() > 0){
				return field.get(loc);
			} else{
				return emptySet;
			}
	}

	public boolean attack(String Name) {
		if(Name == null || Name.length() == 0){
			return true;
		}
		if(!((Name == "Clyde") || (Name == "Blinky") || (Name == "Inky") || (Name == "Pinky"))){
			return true;
		}
		Location p1 = locations.get("pacman");
		Location g1 = locations.get(Name);
		if((Math.abs(p1.x-g1.x) <= 1) && (Math.abs(p1.y-g1.y) <= 1)){
			components.get("pacman");
			
			

			locations.remove("pacman");
			
			field.get(p1).remove(Map.Type.PACMAN);
			gameOver = false;
			return false;
		} 
		return true;
	}
	
	public JComponent eatCookie(String name) {
		JComponent comp = null;
		if (name != null && name.equals("pacman")) {
			String cookieLocStr = "tok_";
			
			// get location of pacman
			Location pmLoc = locations.get(name);
			// See if there is a cookie @ the current location
			HashSet<Type> typesAtLoc = field.get(pmLoc);
			System.out.println(field.get(pmLoc)); 
//			for(Type t: typesAtLoc) {
//				System.out.println(t);
//			}
//			System.out.println(typesAtLoc.toString());
			// Check for existence
			if(!typesAtLoc.contains(Type.COOKIE)) {
				return null;
			}
			// Build String for update
			String cookieID = cookieLocStr + "x" + pmLoc.x + "_y" + pmLoc.y;
			// Remove the cookie from the set
			typesAtLoc.remove(Type.COOKIE);
			 //Update locations, components, field, and cookies
			 field.put(pmLoc, typesAtLoc);
			 comp = components.get(cookieID);
			 components.remove(cookieID);
			 locations.remove(cookieID);
			cookies++;
		}
		return comp;
		
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1
		
	}
	
}
