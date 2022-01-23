package com.checkrunnerdemo;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    static Map<String, Product> items = new HashMap<>();

    static {
        items.put("1", new Product("1","Chips", 1.5));
        items.put("2", new Product("2","Pizza", 7.5));
        items.put("3", new Product("3","Water", 0.5));
        items.put("4", new Product("4","Meat", 5.0));
        items.put("5", new Product("5","Juice", 2.5));
        items.put("6", new Product("6", "Onion", 1.5));
        items.put("7", new Product("7","Ice-cream",2.0));
        items.put("8", new Product("8","Bread", 1.0));
        items.put("9", new Product("9","Fanta", 3.0));
        items.put("10", new Product("10","Kit-Kat",1.0));
    }
}
