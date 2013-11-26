
/*
 * Entity class
 * Used as superclass for all tiles
 * 
 * 
 */
public abstract class Entity {
	//Coordinates
	int x, y;
	
	//Constructor takes coordinates to instantiate the entity at
	public Entity(int x, int y)
	{
		//set coordinates
		this.x = x;
		this.y = y;
	}
}
