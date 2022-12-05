package kodlama.io.northwind.service.abstracts;

import kodlama.io.northwind.entity.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product add(Product product);
    Product update(Product product);

    //Product getById(int id);
}
