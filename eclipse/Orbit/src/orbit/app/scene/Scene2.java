package orbit.app.scene;

import orbit.app.conf.Conf;
import orbit.app.object.Satellite;
import orbit.engine.render.group.Scene;
import orbit.utils.lang.Color;
import orbit.utils.lang.Rand;
import orbit.utils.lang.Size;
import orbit.utils.math.Vector3f;

public class Scene2 extends Scene {

	protected Satellite[] iridium = new Satellite[72];

	protected int[] horizontals = new int[]{
		0, 30, 60, 90, 120, 150
	};

	public void update(){

		for (int i = 0; i < iridium.length; i++){
			iridium[i].update();
		}

	}

	public void render(){

		for (int i = 0; i < iridium.length; i++){
			iridium[i].draw();
		}

	}


	public void load(){

		for (int i = 0; i < iridium.length; i++){

			iridium[i] = new Satellite();

			iridium[i].setColor(new Color(0, 1, 1));
			iridium[i].setSpeed(0.025f);
			iridium[i].setSize(0.2f);
			iridium[i].setRadius(Rand.randomf(Size.resizef(Conf.OBJECT_PLANET_EARTH_RADIUS + 100), Size.resizef(Conf.OBJECT_PLANET_EARTH_RADIUS + 2000)));
			iridium[i].setProgress((float) ((100 / (iridium.length / horizontals.length)) * Math.floor(i / horizontals.length)));
			iridium[i].setOrbit(new Vector3f(0, 40, 0), new Vector3f());
			iridium[i].setAngle(horizontals[i % horizontals.length] + Rand.randomf(-2, 2));
			iridium[i].notifyOrbit();

			if ((i % horizontals.length) % 2 == 1) iridium[i].changePoints(0, 3, 2, 1);

		}

	}

	public void unload(){

		iridium = new Satellite[iridium.length];

	}

}