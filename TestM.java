class MovablePoint implements Movable{
 
    int x;
    int y;
	int xSpeed;
	int ySpeed;
 
    MovablePoint(int x, int y, int xSpeed, int ySpeed)
	{ 
        this.x = x;
        this.y = y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
    }
    public String toString() {
     
        return  "x= "+x+" y= "+y+" xSpeed= "+xSpeed+" ySpeed= "+ySpeed;
    }
	public void MoveUp(){}
	public void MoveDown(){}
	public void MoveLeft(){}
	public void MoveRight(){}
}
class MovableCicle implements Movable {
 
	int radius;
	MovablePoint centre = new MovablePoint(1,2,3,4);
  
    MovableCicle(int x, int y, int xSpeed, int ySpeed,int radius){
          
        centre.x = x;
        centre.y = y;
		centre.xSpeed=xSpeed;
		centre.ySpeed=ySpeed;
		this.radius=radius;
    }
	public String toString() {
     
        return  "x="+centre.x+" y="+centre.y+" xSpeed="+centre.xSpeed+" ySpeed="+centre.ySpeed+" radius="+radius;
    }
	public void MoveUp(){}
	public void MoveDown(){}
	public void MoveLeft(){}
	public void MoveRight(){}
}
public class TestM
{
	public static void main(String[] args)
	{
		
	}
}
