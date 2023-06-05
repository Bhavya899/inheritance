package com.practice.single;

public class Boxweight extends Box {
    double weight;
    Boxweight()
    {
        this.weight=50;
    }
    Boxweight(float length,float width,float height,double weight)
    {
        super(width,length,height);
        this.weight=weight;
    }

}
