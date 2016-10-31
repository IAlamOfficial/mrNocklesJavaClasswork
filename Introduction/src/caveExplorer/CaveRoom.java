package caveExplorer;

public class CaveRoom {

	public CaveRoom(String description) {
		// TODO Auto-generated constructor stub
	}
	// final never changes
	
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	private String description;
	private String directions;
	private String contents;
	private String defaultContents;
	
	private CaveRoom[] borderingRooms;
	private Door[] doors;
	
	
	public void enter() {
		// TODO Auto-generated method stub
		// sets up cave for when entered
	}

}
