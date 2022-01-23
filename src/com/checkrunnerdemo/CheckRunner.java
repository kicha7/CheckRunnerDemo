package com.checkrunnerdemo;


public class CheckRunner {
    public static void main(String[] args) {
        /*
        в Catalog хранится просто общий набор продуктов,
        а в CheckRunner я буд-то добавляю что мне надо и это в итоге подсчитыается
         */
        Cart cart = new Cart();
        cart.addProduct(Catalog.items.get("1"), 2);
        cart.addProduct(Catalog.items.get("2"), 5);
        cart.addProduct(Catalog.items.get("3"), 1);
        cart.addProduct(Catalog.items.get("6"), 2);
        cart.addProduct(Catalog.items.get("8"), 4);

        cart.print();
        
        }

    }

