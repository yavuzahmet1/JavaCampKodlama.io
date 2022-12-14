package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("api/products") // eğer bana örneğin kodlama.io/api/pruducts adresine göre istek gelirse bunu
// controller karar verir ve karşılar.
public class ProductsController {
	// IOS,Angular,Android lerin birbiriyle anlaşabilmesi için controller sınıfı
	// eklenir. Bizim dış dünya ile iletişimi burasıyla kurarız.

	private ProductService productService;

	@Autowired // geziyor bana ProductServis'i arıyor kim implements etmiş ona bakıyor(burda
				// ProductManager) ve bu benim yerime new'leyip (arka planda ProductManager
				// productManager=new ProductManager(); yapıyor) neplenmiş productManager'i
				// buraya yerleştiriyor. bu IOC yöntemiyle yapmış oluyor.
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getAll") // şimdi veri istediğimizde bu anatasyon kullanılır. yani
							// kodlama.io/api/pruducts/getAll denirse bu metod çalışacak
	public DataResult<List<Product>> getAll() {

		return productService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		// gelen requestin bir bodysi var diyorsun, oda nedemek bu bir post işlemi
		// olduğundan execute yaptığımızda
		// mesaj gövdesine bir json biçiminde gönderir. bilgileri bir paket haline
		// getirir
		return productService.add(product);
	}
}
