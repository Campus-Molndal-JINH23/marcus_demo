package se.campusmolndal.unitweb_demo.controller;

import org.springframework.stereotype.Controller; // för webbsidor
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.campusmolndal.unitweb_demo.models.Link;
import se.campusmolndal.unitweb_demo.models.PageInfo;
import se.campusmolndal.unitweb_demo.models.Product;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {

        Product[] products=new Product[6];
        products[0]=new Product("Banan", 10, false, 4.5, "En gul banan", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Banana-Single.jpg", 100, 1);
        products[1]=new Product("Äpple", 5, true, 4.0, "Ett rött äpple", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Red_Apple.jpg/265px-Red_Apple.jpg", 50, 2);
        products[2]=new Product("Päron", 7, false, 3.5, "Ett grönt päron", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Pear.jpg/800px-Pear.jpg", 75, 3);
        products[3]=new Product("Apelsin", 6, true, 4.2, "En orange apelsin", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Orange-Whole-%26-Split.jpg/800px-Orange-Whole-%26-Split.jpg", 60, 4);
        products[4]=new Product("Kiwi", 8, false, 4.1, "En brun kiwi", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Kiwi-Whole-%26-Sliced.jpg/800px-Kiwi-Whole-%26-Sliced.jpg", 80, 5);
        products[5]=new Product("Mango", 12, true, 4.7, "En gul mango", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Mango_4.jpg/800px-Mango_4.jpg", 120, 6);


        Link[] links=new Link[0];

        PageInfo page = new PageInfo("Shop till you drop", "Hej på dig!", links, products);
        model.addAttribute("page", page);
        return "index";
    }
}
