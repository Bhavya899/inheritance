package com.practice.multilevel;

public class Boxcolor extends Boxweight{
    String color;
    Boxcolor(){
        this.color="blue";
    }
    Boxcolor(float height,float width,float length,float weight,String color)
    {
        super(length,width,height,weight);
        this.color=color;
    }
}
