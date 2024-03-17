abstract class Parent{
    abstract void ex1();
    abstract void ex2();
    abstract void ex3();
}
abstract class Child extends Parent{
    public void ex1(){
        System.out.println("ex1");
    }
}

class SecondChild extends Child{
    public void ex2(){
        System.out.println("ex2");
    }
    public void ex3(){
        System.out.println("ex3");
    }
}
class abstract_class_inteface{
    public static void main(String[] args){
        SecondChild child = new SecondChild();
        child.ex1();
        child.ex2();
        child.ex3();

        System.out.print('\n');
    }
}