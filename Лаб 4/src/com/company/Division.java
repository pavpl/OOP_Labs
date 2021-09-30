package com.company;

public class Division
{
    private float a , b;

    Division(float a , float b)
    {
        this.a = a;
        this.b = b;
    }

    protected float calc()
    {
        return a / b;
    }
}
