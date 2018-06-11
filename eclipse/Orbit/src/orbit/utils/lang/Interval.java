package orbit.utils.lang;

import orbit.app.conf.Conf;
import orbit.app.conf.DynaConf;

public class Interval {

	public static boolean isValid(int interval){
		if (System.currentTimeMillis() - DynaConf.LAST[interval] > Conf.INTERVALS[interval]){
			DynaConf.LAST[interval] = System.currentTimeMillis();
			return true;
		}

		return false;
	}

}