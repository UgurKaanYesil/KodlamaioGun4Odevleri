package Concerate;
import Entity.Campaign;
import Entity.User;

public class GameSaleManager {
	
	public void sale(User user, Campaign campaign) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + campaign.getName() +" kampanyasını kullanarak oyun satın aldı.");
	}
}
