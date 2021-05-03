import Abstract.BaseCustomerManager;
import Concerate.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Engin", "Demirog", "1/6/1985", "43217243201"));
		
		//Mernis harici hepsi eklendi

	}

}
