package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service // bu class, bu projenin, servisi olarak göreceğini belirten anatasyon
public class ProductManager implements ProductService {

	private ProductDao productDao;// productDao injection yapıldı

	@Autowired // spring arka planda productDaonun instance sınıfı üretir, bağımlılık
				// oluşturur.
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {

		return new SuccessDataResult<List<Product>>(productDao.findAll(), "Data listed");

	}

	@Override
	public Result add(Product product) {
		productDao.save(product);
		return new SuccessResult("Product added");
	}

}
