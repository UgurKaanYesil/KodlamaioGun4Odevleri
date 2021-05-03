package Concerate;
import Abstract.EdevletValidationService;
import Abstract.UserService;
import Entity.User;

public class UserManager implements UserService{
	private EdevletValidationService edevletValidationService;
	
	
	
	public UserManager(EdevletValidationService edevletValidationService) {
		super();
		this.edevletValidationService = edevletValidationService;
	}

	@Override
	public void add(User user) {
		if(edevletValidationService.checkIfRealPerson(user) == true) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " eklendi.");
		}else {
			System.out.println("Bilgiler hatalı lütfen tekrar deneyin");
		}
		
	}

	@Override
	public void update(User user) {
		if(edevletValidationService.checkIfRealPerson(user) == true) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " güncellendi.");
		}else {
			System.out.println("Bilgiler hatalı lütfen tekrar deneyin");
		}
		
	}

	@Override
	public void delete(User user) {
		if(edevletValidationService.checkIfRealPerson(user) == true) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " silindi.");
		}else {
			System.out.println("Bilgiler hatalı lütfen tekrar deneyin");
		}
		
	}

}
