package com.practice.multilevel;

public class Main {
    public static void main(String[] args) {
        //default constructor

        Boxcolor b=new Boxcolor();
        System.out.println(b.color);

        //parameterized constructor
        Boxcolor b1=new Boxcolor(12,12,12,35,"red");
        System.out.println(b1.weight);
        System.out.println(b1.height);
        System.out.println(b1.length);
        System.out.println(b1.width);
        System.out.println(b1.color);
    }
}
