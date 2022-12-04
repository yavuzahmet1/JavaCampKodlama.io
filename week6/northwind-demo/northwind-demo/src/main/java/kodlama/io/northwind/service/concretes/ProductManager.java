package kodlama.io.northwind.service.concretes;

import kodlama.io.northwind.repository.abstracts.ProductRepository;
import kodlama.io.northwind.service.abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService {
    private final ProductRepository productRepository;
}
