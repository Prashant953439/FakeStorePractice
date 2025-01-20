package com.ecommerce.productservicedec24.controller;

import com.ecommerce.productservicedec24.Models.Product;
import com.ecommerce.productservicedec24.dtos.GetProductDto;
import com.ecommerce.productservicedec24.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
 //Entry point for a backend application

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/{id}")
    public @ResponseBody GetProductDto getProductById(@PathVariable("id")Long id) {
        return productService.getProductById(id);
    }

    @PostMapping("")
    public String createProduct(@RequestBody Product product){
        System.out.println(product.getId());
        System.out.println(product.getTitle());
        System.out.println(product.getPrice());
        return "Product created.";
    }

}
