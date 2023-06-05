package com.practice.single;

public class Main {
    public static void main(String[] args) {

        //default constructor

        Boxweight B=new Boxweight();
        System.out.println(B.height);
        System.out.println(B.width);
        System.out.println(B.length);
        System.out.println(B.weight);

        //parameterized constructor

        Boxweight B1=new Boxweight(12,12,12,70);
        System.out.println(B1.length);
        System.out.println(B1.width);
        System.out.println(B1.height);
        System.out.println(B1.weight);
    }
}
