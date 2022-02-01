package Concrete;

import Abstract.CampaignService;
import Entities.Campaigns;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaigns campaign) {
		System.out.println(campaign.getId() +campaign.getPercent() +"Olusturuldu.");
		
	}

	@Override
	public void delete(Campaigns campaign) {
		System.out.println(campaign.getId() +campaign.getPercent() +"Silindi.");
		
	}

	@Override
	public void update(Campaigns campaign) {
		System.out.println(campaign.getId() +campaign.getPercent() +"Güncellendi.");
		
	}
	

}
