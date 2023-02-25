// RightTriangle class, inherited from Shape
public class RightTriangle extends Shape {
    private double width;
    private double height;
    
    public RightTriangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
    
    @Override
    public double getArea() {
        return 0.5 * width * height;
    }
    
    @Override
    public double getPerimeter() {
        return width + height + Math.sqrt(width * width + height * height);
    }
}
