package com.cafe.menu;
public abstract class Beverage {
    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;

    String name; int basePrice; int size;

    public Beverage(String name, int baseAmount, int defaultShot) {
        this.name = name;
        this.basePrice = baseAmount;
        this.size = defaultShot;
    }

    public boolean setSize(int size) {
        this.size = size;
        return true;
    }

    @Override
    public String toString() {
        return "name=" + name +
               ", Price=" + (basePrice+500*size) +
               ", size=" + toSize(size) ;
    }

    public String toSize(int size) {
        switch(size) {
            case 0: {
                return "TALL";
            }
            case 1: {
                return "GRANDE";
            }
            case 2: {
                return "VENTI";
            }
            default: break;
        }
        return "ERROR";
    }

    public boolean setSize(String size) {
        if ("TALL".equals(size))
            return setSize(TALL);
        else if ("GRANDE".equals(size))
            return setSize(GRANDE);
        else if ("VENTI".equals(size))
            return setSize(VENTI);
        return false;
    }

    public String getName() {
        return this.name;
    }


    public int getPrice() {
        return this.basePrice+500*this.size;
    }
}
