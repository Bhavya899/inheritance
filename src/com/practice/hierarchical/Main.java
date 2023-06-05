package com.practice.hierarchical;

public class Main {
    public static void main(String[] args) {

        //parameterized constructor for Boxcolor class.

        Boxcolor b1=new Boxcolor(14,14,14,"yellow");
        System.out.println(b1.color);
        System.out.println(b1.height);
        System.out.println(b1.width);
        System.out.println(b1.length);

        //parameterized constructor for Boxweight class.
        Boxweight b2=new Boxweight(12,12,12,45);
        System.out.println(b2.weight);
        System.out.println(b2.height);
        System.out.println(b2.width);
        System.out.println(b2.length);

    }
}
