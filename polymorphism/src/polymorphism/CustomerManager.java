package polymorphism;

public class CustomerManager {
	private BaseLoger logger;
	
	public CustomerManager(BaseLoger logger) {
		this.logger = logger;
	}	public void Add() {
		System.out.println("müşteri eklendi");
		this.logger.Log("log mesajı");
	}

}
