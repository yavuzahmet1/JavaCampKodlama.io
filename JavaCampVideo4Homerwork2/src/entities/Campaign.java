package entities;

public class Campaign {
	private String nameOfCompaingn;
	private double priceOfCampaign;

	public Campaign(String nameOfCompaingn, double priceOfCampaign) {
		super();
		this.nameOfCompaingn = nameOfCompaingn;
		this.priceOfCampaign = priceOfCampaign;
	}

	public String getNameOfCompaingn() {
		return nameOfCompaingn;
	}

	public void setNameOfCompaingn(String nameOfCompaingn) {
		this.nameOfCompaingn = nameOfCompaingn;
	}

	public double getPriceOfCampaign() {
		return priceOfCampaign;
	}

	public void setPriceOfCampaign(double priceOfCampaign) {
		this.priceOfCampaign = priceOfCampaign;
	}

}
