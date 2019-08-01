package ru.reuckiy.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.reuckiy.spring.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    List getAllProduct() {
        return productService.getAllProducts();
    }
}
