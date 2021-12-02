package com.cafe.menu;
public class Coffee extends Beverage {
    private int defaultShot;
    private String name;
    private int baseAmount;

    public Coffee(String name) {
        super(name, 4100, TALL);
    }

    public boolean setSize(int size) {
        super.setSize(size);
        return true;
    }

}
