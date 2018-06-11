package orbit.utils.in;

import java.io.InputStream;

public class Resource {

	public static InputStream getRes(String path){
		return ClassLoader.getSystemClassLoader().getResourceAsStream(path);
	}

}