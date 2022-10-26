package polymorphism;

public class ConsoleLogger extends BaseLoger{
	public void Log(String message) {
		System.out.println("logged to console : " + message);
	}

}
