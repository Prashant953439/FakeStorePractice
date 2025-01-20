package com.ecommerce.productservicedec24.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data

public class Product {
 // Database Mapping

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private Long id;
    private String title;
    private String description;
    private  Double price;
    private String image;
    private String category;
    private Double rating;
    private String seller;
}
