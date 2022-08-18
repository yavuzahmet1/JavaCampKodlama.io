package abstracts;

import entities.Campaign;

public interface CampaignManager {
	void newCampaign(Campaign campaign);

	void delete(Campaign campaign);

	void update(Campaign campaign);
}
