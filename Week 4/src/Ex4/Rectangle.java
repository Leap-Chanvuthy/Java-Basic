package Ex4;
public class Rectangle {
    public double width;
    public double height;
    public String color;

    public Rectangle(){

    }
    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width , double height , String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return height*width;
    }
}
