import java.util.*;

interface animal{
    void Walk();
    void Bark();
    void Eat();
} 
interface lamo{
    void Sleep();
}

abstract class _animal{
    public void Walk(){
        System.out.println("Di leng keng");
    }
    abstract void Bark();

}
class Pig1 implements animal{
    public void Walk(){
        System.out.println("Di lung tung");
    }
    public void Bark(){
        System.out.println("Oc oc ");
    }
    public void Eat(){
        System.out.println("An tap");
    }
}
class Pig implements animal, lamo{ // một class có thể imple từ nhiều interfaces}
    public void Walk(){
        System.out.println("Di lung tung");
    }
    public void Bark(){
        System.out.println("Oc oc ");
    }
    public void Eat(){
        System.out.println("An tap");
    }
    public void Sleep(){
        System.out.println(" I sleep");
    }
}
/*class Pig extends animal */  // error 
class Dog extends _animal{
    
    public void Bark(){
        System.out.println("Gau gau");
    }
}

class interfacevsclass {
    public static void main(String[] args){
        Pig p = new Pig();
        p.Bark(); p.Walk();
        Pig1 p1= new Pig1();
        p1.Bark(); p1.Eat();
        Dog d = new Dog();
        d.Bark(); d.Walk();
    }    
}
