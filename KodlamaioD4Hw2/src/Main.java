import Concerate.CampaignManager;
import Concerate.GameSaleManager;
import Concerate.UserManager;
import Concerate.UserValidationManager;
import Entity.Campaign;
import Entity.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Uğur Kaan","Yeşil","3721638","18/12/1997");
		
		UserManager userManager = new UserManager(new UserValidationManager());
		
		userManager.add(user1);
		
		Campaign campaign1 = new Campaign(1, "Ramazan ", "%15 indirim");
		Campaign campaign2 = new Campaign(2, "Paskalya", "%21 indirim");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.update(campaign2);
		campaignManager.add(campaign1);
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sale(user1, campaign1);
	}

}
