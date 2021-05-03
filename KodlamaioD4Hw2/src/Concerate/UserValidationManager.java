package Concerate;
import Abstract.EdevletValidationService;
import Entity.User;

public class UserValidationManager implements EdevletValidationService{

	@Override
	public boolean checkIfRealPerson(User user) {
		if(!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && !user.getNationalityId().isEmpty()) {
			return true;
		}else {
			System.out.println("Bilgiler eksik.");
			
			return false;
		}
		
	}

}
