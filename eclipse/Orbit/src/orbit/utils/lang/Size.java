package orbit.utils.lang;

public class Size {

	/*
	 * Size 1/200
	 */

	public static final float ratio = 200;

	public static float resizef(float origin){
		return origin / ratio;
	}

}