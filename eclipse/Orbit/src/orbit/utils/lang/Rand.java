package orbit.utils.lang;

import java.util.Random;

public class Rand {

	public static float randomf(float min, float max){
		return min + new Random().nextFloat() * (max - min);
	}

	public static int randomi(int min, int max){
		return min + new Random().nextInt() * (max - min);
	}


	public static int randomSign(){
		return (new Random().nextInt(2) == 0 ? -1 : 1);
	}

}