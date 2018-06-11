package orbit.utils.out;

import java.io.PrintStream;

public class Console {

	public static void print(PrintStream stream, String message){
		stream.println(message);
	}
	public static void print(PrintStream stream, String tag, String message, Class<? extends Object> cl){
		Console.print(stream, "[" + tag.toUpperCase() + "] " + cl.getCanonicalName() + " : " + message);
	}


	public static void info(String message, Class<? extends Object> cl){
		Console.print(System.out, "info", message, cl);
	}
	public static void info(String message, Object obj){
		Console.info(message, obj.getClass());
	}


	public static void err(String message, Class<? extends Object> cl){
		Console.print(System.err, "err", message, cl);
	}
	public static void err(String message, Object obj){
		Console.err(message, obj.getClass());
	}
	public static void err(Exception e, Class<? extends Object> cl){
		Console.err(e.getMessage(), cl);
	}
	public static void err(Exception e, Object obj){
		Console.err(e.getMessage(), obj);
	}

}