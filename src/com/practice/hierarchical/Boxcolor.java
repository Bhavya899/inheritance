package com.practice.hierarchical;

public class Boxcolor extends Box{
    String color;
    Boxcolor(){
        this.color="blue";
    }
    Boxcolor(float height,float width,float length,String color)
    {
        super(length,width,height);
        this.color=color;
    }
}
