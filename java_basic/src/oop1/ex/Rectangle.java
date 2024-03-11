package oop1.ex;

public class Rectangle {
    int width;
    int height;

    void calculateArea(width,height){
        return width * height;
    }
    void calculatePerimeter(width,height){
        return 2 * (width + height);
    }
    boolean isSquare(){
        return width == height;
    }

}