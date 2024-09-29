package com.generic;

public class GenericDemo <T> {
    T data;
    public GenericDemo(T data) {
        this.data = data;
    }

    public String getClassName() {
        return data.getClass().getName();
    }

    public static void main(String[] args) {
        GenericDemo<Integer> iobj = new GenericDemo<Integer>(111);
        System.out.println(iobj.getClassName());

        GenericDemo<String> sobj = new GenericDemo<String>("Hello");
        System.out.println(sobj.getClassName());
    }
}
