package interfaces;

public class MysSqlCustomerDal implements ICustomerDal,IRepository{
	public void add() {
		System.out.println("my sql eklendi");
	}

}
