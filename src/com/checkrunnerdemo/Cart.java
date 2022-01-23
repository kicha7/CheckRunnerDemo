package com.checkrunnerdemo;

import java.util.*;

public class Cart {
    Date date;
    double total;
    Map<String, CartItem> items = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        this.items.put(product.getId(), new CartItem(product, quantity));
        System.out.println("Quantity: " + quantity + ", Total price " + product.getName() + " " + (product.getPrice() * quantity));

        this.setTotal();
    }

    private void setTotal() {
        double total = 0;

        for (CartItem item : this.items.values()) {
            total += item.getProduct().getPrice() * item.getQuantity();

        }

        this.total = total;
    }

    public void print () {
        System.out.println("Total: " + this.total);
    }

}

