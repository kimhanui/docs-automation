package org.example.member;

import lombok.Getter;

import java.util.Random;

@Getter
public class ProductDTO {
    private int productId;
    private String name;
    private int price;

    public static ProductDTO random() {
        ProductDTO product = new ProductDTO();
        Random random = new Random();
        product.productId = random.nextInt();
        product.name = "product" + random.nextInt();
        product.price = 100;
        return product;
    }
}
