//Factory requires:
//abstract creator, 
//concrete creator, 
//abstract products, 
//concrete products

enum ShapeType{
    Square,
    Rectangle,
    Triangle
}
// abstract product
interface Shape{
    public void draw();
}
//concrete product
class Rectangle implements Shape{
    public void draw(){
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
    }
}
class Triangle implements Shape{
    public void draw(){
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
    }
}
class Square implements Shape{
    public void draw(){
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
    }
}
//abstract creator
abstract class ShapeFactory {
    abstract Shape createShape();
    public void draw(){
        Shape shape = createShape();
        shape.draw();
    }
}
//concrete creator
class RectangleFactory extends ShapeFactory{
    public Shape createShape(){
        return new Rectangle();
    }
}
class TriangleFactory extends ShapeFactory{
    public Shape createShape(){
        return new Triangle();
    }
}
class SquareFactory extends ShapeFactory{
    public Shape createShape(){
        return new Square();
    }
}

class FactoryPattern{
    public static void main(String[] args){
        ShapeFactory shapeFactory = null;
        ShapeType type = ShapeType.Square;

        switch(type){
            case ShapeType.Rectangle:
                shapeFactory = new RectangleFactory();
            break; 
            case ShapeType.Square:
                shapeFactory = new SquareFactory();
            break; 
            case ShapeType.Triangle:
                shapeFactory = new TriangleFactory();
            break; 
        }

        shapeFactory.createShape();
        shapeFactory.draw();
    }
}