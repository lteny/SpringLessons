package ru.reuckiy.spring.dao;

import org.springframework.stereotype.Repository;
import ru.reuckiy.spring.model.Product;

import java.util.Arrays;
import java.util.List;

@Repository
public class ProductDao {
    private List<Product> products = Arrays.asList(new Product(1, "product 1", "200"),
            new Product(2, "product 2", "300"),
            new Product(3, "product 3", "250"),
            new Product(4, "product 4", "500"));

    public List<Product> getAllProducts() {
        return products;
    }
}
