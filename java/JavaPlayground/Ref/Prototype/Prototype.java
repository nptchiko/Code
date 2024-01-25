import java.util.*;

abstract class Shape{
    public int x;
    public int y;
    public String color;

    public Shape(){

    }
    Shape(Shape target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Shape)) return false;
        Shape shape = (Shape)obj;
        return x == shape.x && shape.y == y && shape.color == color;
    }

}
class Circle extends Shape{
    public double radius;

    Circle(){}
    public Circle(Circle target){
        super(target);
        if(target != null){
            this.radius = target.radius;
            this.color = target.color;
        }
    }
    public Shape clone(){
        return new Circle(this);
    }
    @Override 
    public boolean equals(Object obj){
        if(!(obj instanceof Circle)) return false;
        Circle circle = (Circle)obj;
        return circle.radius == this.radius;
    }
}
class Rectangle extends Shape{
    public int width;
    public int height;

    Rectangle(){}
    Rectangle(Rectangle target){
        super(target);
        if(target != null){
            this.width = target.width;
            this.height = target.height;
            this.color = target.color;
        }
    }
    public Shape clone(){
        return new Rectangle(this);
    }
    @Override 
    public boolean equals(Object obj){
        if(!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle)obj;
        return rectangle.width == this.width && rectangle.height == this.height;
    }
}

class Prototype {
    public static void cloneAndcompare(List<Shape> shapes, List<Shape> copyShapes){
        for(Shape shape : shapes){
            copyShapes.add(shape.clone());
        }
        for(int i = 0; i < 3; i++){
            if(copyShapes.get(i) != shapes.get(i)){
                System.out.println(i + " come from different object");
                if(shapes.get(i).equals(copyShapes.get(i))){
                    System.out.println("    identical");
                } else{
                    System.out.println("    not identical");
                }
            } else {
                System.out.print(i + " come from same object");
            }
        }
    }
    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<Shape>();
        List<Shape> copyShapes = new ArrayList<Shape>();

        Circle c = new Circle();
        c.radius = 5.5; c.color = "Black";

        Circle _c = (Circle)c.clone();

        shapes.add(c); shapes.add(_c);

        Rectangle r = new Rectangle();
        r.height = 10; r.width = 20;
        r.color = "white";

        Rectangle _r = (Rectangle)r.clone();

        shapes.add(r); shapes.add(_r);

        cloneAndcompare(shapes, copyShapes);

    }
    
}
