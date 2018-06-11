package orbit.engine.controllers;

import orbit.engine.group.Movable;
import orbit.engine.group.Rotable;

public interface MovableAndRotableController {

	public void active(Movable movable);
	public void active(Rotable rotable);

	public void active(Movable movable, Rotable rotable);

}