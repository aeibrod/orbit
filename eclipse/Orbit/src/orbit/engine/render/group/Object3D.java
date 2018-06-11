package orbit.engine.render.group;

public abstract class Object3D {

	protected boolean isinit = false;
	protected boolean isvisible = true;

	public abstract void update();
	protected abstract void render();

	protected abstract void init();


	public void draw(){
		if (!isinit){
			isinit = true;
			init();
		}

		if (isvisible) render();
	}


	public void show(){
		isvisible = true;
	}
	public void hide(){
		isvisible = false;
	}


	public boolean isVisible(){
		return isvisible;
	}

}