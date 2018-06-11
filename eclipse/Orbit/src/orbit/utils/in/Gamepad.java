package orbit.utils.in;

import net.java.games.input.Component;

public class Gamepad {

	public static boolean isActive(Component component, String event){
		return component.getName().equals(event);
	}

	public static boolean isActive(Component component, String[] events){
		for (int i = 0; i < events.length; i++){
			if (isActive(component, events[i])) return true;
		}

		return false;
	}

}