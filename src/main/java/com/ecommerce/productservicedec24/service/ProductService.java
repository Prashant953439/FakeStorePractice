package com.ecommerce.productservicedec24.service;

import com.ecommerce.productservicedec24.Models.Product;
import com.ecommerce.productservicedec24.dtos.GetProductDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {
    public GetProductDto getProductById(Long id){
    // main layer where main business logic is residing

    RestTemplate restTemplate = new RestTemplate();

    String url = "https://fakestoreapi.com/products/" + id;
    Product product = restTemplate.getForObject(url, Product.class);


        System.out.println(product);


        GetProductDto obj =  new GetProductDto();
        obj.setName(product.getTitle());
        obj.setPrice(product.getPrice());
        obj.setImageUrl(product.getImage());
        return obj;

    }
}
