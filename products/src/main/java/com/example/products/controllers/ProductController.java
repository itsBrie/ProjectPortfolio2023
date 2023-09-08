package com.example.products.controllers;

import com.example.products.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Uses the service class to call the use cases
@Controller
public class ProductController {
private final ProductService productService;

public ProductController(ProductService productService){
    this.productService=productService; //gets the Service Bean from the Spring context
}
@RequestMapping("/products") //GET Method
    public String viewProducts(Model model){
    var products=productService.findAll();
    model.addAttribute("products",products);
    return "products";
}


}


