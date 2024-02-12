package com.aaronporter.module11;

public class TwoDShape
{
    private double width;
    private double height;

    TwoDShape()
    {
        this.width = 0.0;
        this.height = 0.0;
    }

    TwoDShape(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return width * height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getWidth()
    {
        return width;
    }

    @Override
    public String toString()
    {
        return "2D Shape with width of " + width + " and height of " + height;
    }
}
