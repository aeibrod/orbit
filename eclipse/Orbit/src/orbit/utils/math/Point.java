package orbit.utils.math;

public class Point {

	protected float x = 0;
	protected float y = 0;

	public Point(){
		this(0, 0);
	}
	public Point(float x, float y){
		this.x = x;
		this.y = y;
	}


	public float getX(){
		return x;
	}
	public float getY(){
		return y;
	}

}