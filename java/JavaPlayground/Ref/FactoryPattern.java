enum ShapeType{
    Square,
    Rectangle,
    Triangle
}
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
    }
}
class ShapeFactory{
    public Shape create(ShapeType _shape){
        if(ShapeType.Rectangle.compareTo(_shape) == 0){
            return new Rectangle();
        } else if(ShapeType.Square.compareTo(_shape) == 0){
            return new Square();
        } else if(ShapeType.Triangle.compareTo(_shape) == 0){
            return new Triangle();
        }
        return null;
    }
}
class User{
    private Shape shape;

    User(){ this.shape = null;}

    public void initShape(ShapeType _shape){
        ShapeFactory temp  = new ShapeFactory();
        this.shape = temp.create(_shape);    
    }
    Shape getShape(){ return this.shape;  }
}
class FactoryPattern{
    public static void main(String[] args){
        User user = new User();
            user.initShape(ShapeType.Triangle);
            user.getShape().draw();

            user.initShape(ShapeType.Rectangle);
            user.getShape().draw();

            user.initShape(ShapeType.Square);
            user.getShape().draw();
    }
}