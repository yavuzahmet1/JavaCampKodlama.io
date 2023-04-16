package kodlama.io.northwind.controller;

import kodlama.io.northwind.entity.concretes.Product;
import kodlama.io.northwind.service.abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductsController {
    private final ProductService productService;

    @GetMapping("/getallproducts")
    public List<Product> getAllProducts(){
        return productService.getAll();
    }

}
