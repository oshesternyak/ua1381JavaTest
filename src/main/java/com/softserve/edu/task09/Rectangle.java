package com.softserve.edu.task09;

public class Rectangle {
    private double width;
    private double height;
    private double angle;

    public Rectangle() {
        this.width=1.0;
        this.height=1.0;
        this.angle=90;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        this.angle = 90;
    }

    public double calculateArea(){
        return width * height;
    }

    public double calculatePerimeter(){
        return 2 * (width + height);
    }

    public double getDiagonal(){
        return Math.sqrt(width * width + height * height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
}
