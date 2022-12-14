package concretes;

import abstracts.ICampaignManager;
import entities.Campaign;

public class CampaignManger implements ICampaignManager {

	@Override
	public void newCampaign(Campaign campaign) {
		System.out.println("Yeni kampanya girişi yapıldı : " + campaign.getNameOfCompaingn());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getNameOfCompaingn() + " silindi.");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getNameOfCompaingn() + " bilgiler güncellenmiştir.");

	}

}
