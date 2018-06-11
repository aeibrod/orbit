package orbit.utils.lang;

import orbit.app.conf.Conf;

public class ConfWorker {

	public static String getSpecifications(){

		StringBuilder string = new StringBuilder();

		for (int i = 0; i < Conf.APP_SPECIFICATIONS.length; i++){
			string.append(Conf.APP_SPECIFICATIONS[i] + (i + 1 == Conf.APP_SPECIFICATIONS.length ? "" : "-"));
		}

		return string.toString();
	}

}