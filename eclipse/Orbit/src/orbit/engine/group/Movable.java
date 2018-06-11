package orbit.engine.group;

import orbit.utils.math.Vector3f;

public interface Movable {

	public Vector3f getPosition();
	public Vector3f getForward();
	public Vector3f getRight();

	public float getSpeed();

}