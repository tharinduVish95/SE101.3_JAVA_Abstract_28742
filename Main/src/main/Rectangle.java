package main;
public class Rectangle extends Shape
{
    private double length;
    private double width;

    Rectangle(double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double calculateArea()
    {
        return length * width;
    }
}
