package ru.reuckiy.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reuckiy.spring.dao.ProductDao;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public List getAllProducts() {
        return productDao.getAllProducts();
    }
}
