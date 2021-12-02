package com.cafe.order;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<OrderItem>();

    public void add(OrderItem item) {
        items.add(item);
    }

    public int cost() {
        int cost = 0;
        for(int i=0; i<items.size();i++) {
            cost += items.get(i).beverage.getPrice() * items.get(i).quantity;
        }
        return cost;
    }

    public boolean setSize(String name, String size) {
        for(int i=0; i<items.size();i++) {
            if(items.get(i).beverage.getName().equalsIgnoreCase(name)) {
                if(items.get(i).beverage.setSize(size)) {
                   return true;
                }
            }
        }
        return false;
    }

    public void print() {
        for(int i=0; i<items.size(); i++) {
            System.out.println(items.get(i));
        }
        System.out.printf("Total: %,d%n",cost());
    }
}
