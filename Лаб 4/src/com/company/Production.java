package com.company;

public class Production
{
    private float a , b;

    Production(float a , float b)
    {
        this.a = a;
        this.b = b;
    }

    protected float calc()
    {
        return a * b;
    }
}
