package orbit.main;

import orbit.app.conf.Conf;
import orbit.utils.lang.ConfWorker;
import orbit.utils.out.Console;

public class Main {

	public static Orbit orbit;

	public static void main(String[] args){

		orbit = new Orbit();

		Console.info("Welcome to " + Conf.APP_NAME + " v" + Conf.APP_VERSION + "-" + ConfWorker.getSpecifications(), Main.class);

		Console.info("Initializating...", Main.class);
		orbit.initgl();
		orbit.init();

		orbit.start();
		orbit.loop();

	}

}