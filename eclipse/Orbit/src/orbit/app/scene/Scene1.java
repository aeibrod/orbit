package orbit.app.scene;

import orbit.app.conf.Conf;
import orbit.app.object.Point;
import orbit.engine.render.group.Scene;
import orbit.utils.lang.Rand;
import orbit.utils.lang.Size;
import orbit.utils.math.WeightedRandom;

import org.lwjgl.opengl.GL11;

public class Scene1 extends Scene {

	protected Point[] points = new Point[15000];

	public void update(){

		for (int i = 0; i < points.length; i++){
			points[i].update();
		}

	}

	public void render(){

		GL11.glBegin(GL11.GL_POINTS);

		for (int i = 0; i < points.length; i++){
			points[i].draw();
		}

		GL11.glEnd();

	}


	public void load(){

		WeightedRandom lowOrbit = new WeightedRandom()
			.pin(0, 0)
			.pin(90, 2000)
			.pin(120, 4000)
			.pin(130, Conf.ORBIT_GEOSTATIONARY_ALTITUDE);

		WeightedRandom geoOrbit = new WeightedRandom()
			.pin(0, Conf.ORBIT_GEOSTATIONARY_ALTITUDE - 200)
			.pin(1, Conf.ORBIT_GEOSTATIONARY_ALTITUDE + 200);

		for (int i = 0; i < points.length / 100 * Conf.ORBIT_LOW_PERCENT_SATELLITE; i++){

			points[i] = new Point();

			points[i].setProgress(Rand.randomf(0, 100));
			points[i].setSpeed(Rand.randomf(0.02f, 0.05f));
			points[i].setRadius(Size.resizef(Conf.OBJECT_PLANET_EARTH_RADIUS + lowOrbit.random()));

			points[i].randomOrbit();

		}

		for (int i = points.length / 100 * Conf.ORBIT_LOW_PERCENT_SATELLITE; i < points.length; i++){

			points[i] = new Point();

			points[i].setSpeed(0.01f);
			points[i].setRadius(Size.resizef(Conf.OBJECT_PLANET_EARTH_RADIUS + geoOrbit.random()));

			points[i].randomPlaneOrbit();

		}

	}

	public void unload(){

		points = new Point[points.length];

	}

}