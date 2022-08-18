package abstracts;

import entities.Campaign;

public interface ICampaignManager {
	void newCampaign(Campaign campaign);

	void delete(Campaign campaign);

	void update(Campaign campaign);
}
