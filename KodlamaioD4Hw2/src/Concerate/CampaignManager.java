package Concerate;
import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya gğncellendi.");
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("Kampanya kaldırıldı.");
		
	}

}
