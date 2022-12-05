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

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }
   /* @GetMapping
    public Product getById(int id){
        return productService.getById(id);
    }*/
}
