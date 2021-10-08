# PacMan 

Names: Greg Newbold, Liam Y Lehr, Seema Shaik


<img width="290" alt="startmenu" src="https://user-images.githubusercontent.com/69174560/136595325-8ea13a3c-1f7d-4060-ab74-b982f735516e.PNG">


<img width="292" alt="gameplay" src="https://user-images.githubusercontent.com/69174560/136595346-7378fb1c-3870-4dc5-97e6-f9c22d01fb79.PNG">


**Commands To Start The Game:**

```console
javac -cp "src/" src/*.java

java -cp "src/" StartMenu  
```

**PacMan - get_valid_moves() -> ArrayList<Location>:** This function returns a list of the neighboring locations to the PacMan object that do not have a Wall. This function will check for cells that are diagonal to the PacMan.
  
**TestPacManValidMoves:** This test class tests the get_valid_moves() function in the PacMan.java class. It checks that the function does not return locations with walls and does return all other region types.
  
**PacMan - is_ghost_in_range():** This function return true if there is a ghost in range of PacMan and false otherwise. A ghost being in range means that there is either a ghost one space to the left, right, below, above, or diagonal to pacman.

**TestGhostInRange:** This Junit teste class tests various cases regarding the is_ghost_in_range() method. It checks the cases where a ghost is horizontal to pacman and in range, vertical to pacman and in range, and diagonal to pacman and in range. It also tests the cases where the ghost is slightly out of range and the case where the ghost is very out of range 

**Ghost - get_valid_moves() -> ArrayList<Location>:** This function returns a list of the neighboring locations to a Ghost object that do not have a Wall. This function will check for cells that are diagonal to the Ghost.
  
**TestPacManValidMoves:** This test class tests the get_valid_moves() function in the Ghost.java class. It checks that the function does not return locations with walls and does return all other region types.
 
**Ghost - is_pacman_in_range():** This function return true if pacman is in range of the specified ghosts coordinates, and false otherwise. A ghost being in range means that pacman is either one space to the left, right, below, above, or diagonal to the specified ghost's coordinates.

**TestPacManInRange:** This Junit teste class tests various cases regarding the is_pacman_in_range() method. It checks the cases where pacman is horizontal to a ghost and in range, vertical to a ghost and in range, and diagonal to a ghost and in range. It also tests the cases where the pacman is slightly out of range and the case where pacman is very out of range. These tests are performed for the case where there is only one ghost, and the case where there are multiple ghosts. 

**Map - move() -> boolean:** This method updates the locations HashMap<String, Location> with the new location for the PacMan/Ghost object specified, uses the setLocation() on the JComponent object stored in the components HashMap<String, JComponent>, removes the Map.Type(PACMAN/GHOST) from the HashSet<Type> at the fields HashMap<Location, HashSet<Type>> using the old location as the key, then adds the the Map.Type(PACMAN/GHOST) from the HashSet<Type> at the fields HashMap<Location, HashSet<Type>> using the passed in location as the key.
  
**TestMapMove:** This test class tests for a case where the pacman object can't move anywhere and then another where it can move to one spot.

**Map - attack():** This method checks if the specified ghost can attack pacman. The ghost can attack pacman if pacman is 1 space left, right, above, below, or diagonal to the ghost. If the ghost can attack pacman return true, otherwise return false. 

**TestMapAttack:** This method performs various tests on the attack() method in map class. It checks the cases where pacman is horizontal to a ghost and in range, vertical to a ghost and in range, and diagonal to a ghost and in range. It also tests the cases where the pacman is slightly out of range and the case where pacman is very out of range. These tests are performed for the case where there is only one ghost, and the case where there are multiple ghosts. 
  
**Consume():** This method checks to see if there is a cookie in pacman's current location and if there is, it will call the eat cookie method from the Map class and return a component or null otherwise. 

**TestConsume:** This method creates a case where pacman and a cookie are in same location and calls consume to make sure null does not return for a sucessful case, and checks for a failed case where null is expected to return if there is no cookie at pacman's current location.
  
**attack():** This method checks to see if pacman is in range to attack using the in range method and calls attack from map class and returns true if attack is sucessful or false otherwise.

**TestAttack:** This method tests the attack method. First it creates the ghost and pacman loactions (within range if attack) and adds them to the frame and calls attack to see if it returns true on a sucessful case and failed case.
  
**getLoc():** This method returns current location for a given argument such as Empty, Pacman, Cookie, Ghost or Wall.
  
**TestMapGetLoc:** This method creates locations for different types such as pacman, empty, cookie etc and calls the get loc method to see if it returns the correct type. 
  
