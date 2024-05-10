package com.example.OnlineStore.services;

import com.example.OnlineStore.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;
    {
        products.add(new Product(++ID,"PS5", "simple descr", 67000, "Krasnodar", "Pety"));
        products.add(new Product(++ID,"Iphone 8", "Simple description", 20000, "anapa","Leha" ));
    }
    public List<Product> listProducts(){return products; }
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductBYID(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }
}
