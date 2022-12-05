package kodlama.io.northwind.repository.abstracts;

import kodlama.io.northwind.entity.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    //Product findById(int id);
}
