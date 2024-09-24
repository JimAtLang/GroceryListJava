package com.lang.grocerylist;
import java.util.ArrayList;

public class GroceryList {
    public void addItem(String item){
        list.add(item);
    }
    public void removeItem(String item){
        list.remove(item);
    }
    public boolean findItem(String item){
        if(list.indexOf(item)>0){
            return true;
        }
        return false;
    }
}