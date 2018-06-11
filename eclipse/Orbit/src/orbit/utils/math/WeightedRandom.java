package orbit.utils.math;

import java.util.ArrayList;

import orbit.utils.lang.Rand;

public class WeightedRandom {

	protected ArrayList<Point> points = new ArrayList<Point>();

	public WeightedRandom(){ }


	public WeightedRandom pin(float x, float y){

		if (x != 0 && x <= length()) return this;

		points.add(new Point(x, y));

		return this;
	}


	public int size(){
		return points.size();
	}
	public float length(){
		return (size() > 0) ? get(size() - 1).getX() : 0;
	}
	public float first(){
		return (size() > 0) ? get(0).getX() : 0;
	}


	public Point get(int i){
		return points.get(i);
	}


	public Point[] getPointsAround(float x){

		for (int i = 0; i < size(); i++){

			if (get(i).getX() <= x && x <= get(i + 1).getX()){
				return new Point[]{ get(i), get(i + 1) };
			}

		}

		return new Point[]{ new Point(), new Point() };
	}



	public float random(){

		float x = Rand.randomf(first(), length());
		Point[] p = getPointsAround(x);

		return p[0].getY() + ((( x - p[0].getX() ) * 100 / ( p[1].getX() - p[0].getX() )) * (( p[1].getY() - p[0].getY()) / 100 ) );
	}

}