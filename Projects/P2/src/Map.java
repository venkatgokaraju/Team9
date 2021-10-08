import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

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
		
	public boolean move(String name, Location loc, Type type) {
		//update locations, components, and field
		//use the setLocation method for the component to move it to the new location
		return false;
	}
	
	public HashSet<Type> getLoc(Location loc) {
		if (loc.x > dim || loc.y > dim || loc.x == 0 || loc.y == 0){
			return wallSet;
		}
		if (field.containsKey(loc)){
			if (field.get(loc).size() > 0){
				return field.get(loc);
			} else{
				return emptySet;
			}
		}
		return emptySet;
//		//wallSet and emptySet will help you write this method
//		return null;
	}

	public boolean attack(String Name) {
		//update gameOver
		return false;
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
		}
		return comp;
		
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1
		
	}
	
}
