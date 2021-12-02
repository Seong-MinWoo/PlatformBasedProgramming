package com.cafe.menu;
public class Blended extends Beverage{
    private int defaultShot;
    private String name;
    private int baseAmount;

    public Blended(String name) {
        super(name, 6300, GRANDE);
    }

    public boolean setSize(int size) {
        if(size == GRANDE) {
            super.setSize(size);
            return true;
        }
        return false;
    }

}
