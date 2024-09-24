package com.lang.grocerylist;

public class App {
    public static void main(String[] args) throws Exception {
        GroceryList list = new GroceryList();
        list.addItem("eggs");
        list.addItem("milk");
        list.addItem("bread");
        System.out.println(list.findItem("eggs"));
        System.out.println(list.findItem("pizza crust"));
        list.removeItem("milk");
        System.out.println(list.findItem("milk"));
    }
}
