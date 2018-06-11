package orbit.utils.in;

public class Keyboard {

	public static boolean isDown(int key){
		return org.lwjgl.input.Keyboard.isKeyDown(key);
	}

	public static boolean isDown(int[] keys){
		for (int i = 0; i < keys.length; i++){
			if (isDown(keys[i])) return true;
		}

		return false;
	}


	public static boolean isPressed(int key){
		if (org.lwjgl.input.Keyboard.getEventKey() == key){
			if (org.lwjgl.input.Keyboard.getEventKeyState()){
				return true;
			}
		}

		return false;
	}

	public static boolean isPressed(int[] keys){
		for (int i = 0; i < keys.length; i++){
			if (isPressed(keys[i])) return true;
		}

		return false;
	}


	public static boolean next(){
		return org.lwjgl.input.Keyboard.next();
	}

}