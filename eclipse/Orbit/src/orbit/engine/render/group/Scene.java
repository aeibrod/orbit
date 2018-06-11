package orbit.engine.render.group;

public abstract class Scene {

	public abstract void update();
	public abstract void render();

	public abstract void load();
	public abstract void unload();

}