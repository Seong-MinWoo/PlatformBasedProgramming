package com.cafe.order;
import com.cafe.menu.*;
public class OrderItem {
    Beverage  beverage;
    int quantity;

    @Override
    public String toString() {
        return  "[ " +
                beverage.toString() +
                ", quantity=" + quantity +
                " ]";
    }

    public OrderItem(Beverage beverage, int quantity) {
        this.beverage = beverage;
        this.quantity = quantity;
    }
}
