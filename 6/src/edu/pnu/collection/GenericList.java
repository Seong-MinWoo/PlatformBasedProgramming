package edu.pnu.collection;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;


    public int size() {
        return this.size;
    }

    public T get(int i) {
        return (T)data[i];
    }

    public void add(T o) {
        if(size == 0) {
            data = new Object[DEFAULT_SIZE];
        }
        data[size] = o;
        size++;
    }

}
