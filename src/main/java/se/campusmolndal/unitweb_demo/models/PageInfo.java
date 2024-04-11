package se.campusmolndal.unitweb_demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageInfo {
    private String title;
    private String message;
    private Link[] topNav; // Länkar högst upp på sidan
    private Product[] products; // Produkter som ska visas
}
