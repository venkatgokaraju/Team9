# PacMan 

Names: Greg Newbold, Liam Y Lehr

[Insert Image Once working]

[Insert Command Line Instructions Once Working]


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
