package orbit.app.conf;

public class DynaConf {

	public static boolean SHOW_SATELLITE_ORBIT = false;

	public static boolean ROTATE_ACTIVATED         = false;
	public static boolean ROTATE_RESET             = false;
	public static float   ROTATE_VALUE             = 0;

	public static long    ROTATE_RESET_BEGIN       = 0;
	public static float   ROTATE_RESET_SAVE_VALUE  = 0;
	public static float   ROTATE_RESET_RATIO       = 0;

	public static int VIEW_ID = 0;

	// Conf.INTERVALS
	public static double[] LAST = new double[]{
		0, // scene change
		0  // scene action
	};

}