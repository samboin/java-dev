package polymorphism;

public class FileLogger extends BaseLoger{
	public void Log(String message) {
		System.out.println("logged to file : " + message);
	}
}
