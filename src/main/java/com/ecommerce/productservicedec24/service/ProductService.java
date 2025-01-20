package com.ecommerce.productservicedec24.service;

import com.ecommerce.productservicedec24.Models.Product;
import com.ecommerce.productservicedec24.dtos.GetProductDto;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {


    public GetProductDto getProductById(Long id){
    // main layer where main business logic is residing

    RestTemplate restTemplate = new RestTemplate();

    String url = "https://fakestoreapi.com/products/" + id;
    Product product = restTemplate.getForObject(url, Product.class);


        System.out.println(product);


        return convertToDto(product);

    }


    private static GetProductDto convertToDto(Product product) {
        GetProductDto obj =  new GetProductDto();
        obj.setName(product.getTitle());
        obj.setPrice(product.getPrice());
        obj.setImageUrl(product.getImage());
        return obj;
    }

    public List<GetProductDto> getAllProducts() {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://fakestoreapi.com/products/";
        Product[] products = restTemplate.getForObject(url, Product[].class);
        List<GetProductDto> returnedProducts = new ArrayList<>();

        for(Product product: products){
            returnedProducts.add(convertToDto(product));
        }
        return returnedProducts;
    }
}
