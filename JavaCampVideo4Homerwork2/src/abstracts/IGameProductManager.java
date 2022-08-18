package abstracts;

import entities.Campaign;
import entities.Customer;
import entities.GameProduct;

public interface IGameProductManager {
	void sellGameProduct(GameProduct gameProduct, Customer customer, Campaign campaign);

}
