package oop_hw2_rectangle;

public class Rectangle implements IGeometry, IConst, IDefault {


    private int width;
    public int height;

    public Rectangle() {
        this(10, 10);
    }

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public int calcArea() { // переопределение
        return -1;
    }

    @Override
    public int calcPerimeter() { // переопределение
        return -1;
    }

    public int calcArea(Rectangle rectangle) { // перегрузка
        int area = rectangle.getWidth() * rectangle.getHeight();
        return area;
    }

    public int calcPerimeter(Rectangle rectangle) { // перегрузка и константа
        int perimeter = SIDES * (rectangle.getHeight() + rectangle.getWidth());
        return perimeter;
    }


}
