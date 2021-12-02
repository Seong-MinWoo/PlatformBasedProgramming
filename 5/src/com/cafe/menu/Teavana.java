package com.cafe.menu;
public class Teavana extends Beverage{
    private int defaultShot;
    private String name;
    private int baseAmount;

    public Teavana(String name) {
        super(name, 4100, TALL);
    }

    public boolean setSize(int size) {
        if(size != GRANDE) {
            super.setSize(size);
            return true;
        }
        return false;
    }

}
