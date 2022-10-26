package polymorphism;

import java.io.File;

public class main {

	public static void main(String[] args) {
//		BaseLoger[] loggers = new BaseLoger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//		for(BaseLoger logger:loggers) {
//			logger.Log("log mesajı");
//		}
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.Add();

	}

	

}
