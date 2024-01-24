interface Animal{
     
    default void print(){
        System.out.println("This is Animal");
    }
    void My_name();
    void I_eat();
    void I_say();
}
interface Animal_2{
    default void print(){
        System.out.println("this is not Animal");
    }
}
class Dog implements Animal{

    @Override
    public void My_name(){
        System.out.println("My name is Dog");
    }

    @Override
    public void I_eat(){
        System.out.println("I eat meat");
    }

    @Override
    public void I_say() {
        System.out.println("Gau Gauw");
    }
}
class Cat implements Animal{

    @Override 
    public void My_name(){
        System.out.println("My name is Meow");
    }
    @Override
    public void I_eat(){
        System.out.println("I eat mouse");
    }
    @Override
    public void I_say() {
        System.out.println("Meow Meow");
    }
    
}
class Shiba extends Dog{

    @Override
    public void My_name(){
        System.out.println("My name is Chiba");
    }

    @Override
    public void I_eat(){
        System.out.println("I eat Pate");
    }
    @Override  
    public void I_say(){
        System.out.println("I say OW ow");
    }
    public void Special(){
        System.out.println("I'm special than cat");
    }
}
class Animal_Test implements Animal, Animal_2{
    public void My_name(){}
    public void I_eat(){}
    public void I_say(){}

    public void print(){
        Animal.super.print();
        Animal_2.super.print();
    }

}
class test{
    public static void main(String[] args) throws ClassCastException {
        Dog d1 = new Dog();
        d1.My_name(); d1.I_eat(); d1.I_say();
        System.out.println();
        Cat cat = new Cat();
        cat.My_name(); cat.I_eat(); cat.I_say();

        System.out.println();

        //upcasting
        Dog d2 = new Shiba();
        //d2 can access all methods of the Dog class but not the Shiba
        //with reference to the Shiba
        d2.My_name();   d2.I_eat(); d2.I_say();
        System.out.println();
        //downcasting 
        Shiba d3 = (Shiba)d2; // There's a hilarious thing that U must declare upcasting before downcasting
        d3.My_name(); d3.I_eat(); d3.I_say();
        d3.Special();

        Animal_Test d4 = new Animal_Test();
        d4.print();
    }
}