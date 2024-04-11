package se.campusmolndal.unitweb_demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private double price;
    private boolean sale=false;
    private double rating=3.5;
    private String description;
    private String imageUrl;
    private int amountInStock=0;
    private int id;
}
