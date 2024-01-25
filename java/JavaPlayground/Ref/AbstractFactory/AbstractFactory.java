//abstract factory includes:
//abstract product
//abstract factory
//concrete product 
//concrete factory

//first abstract product
interface Coffee{
    public void getDetails();
}
//second abstract product
interface Milk{
    public void getDetails();
}
//concrete product of Coffee class
class HotCoffee implements Coffee{
    public void getDetails(){
        System.out.println("You chose hot coffee for breakfast!");
    }
}
class ColdCoffee implements Coffee{
    public void getDetails(){
        System.out.println("You chose cold coffee for breakfast!");
    }
}
//concrete product of Milk class
class HotMilk implements Milk{
    public void getDetails(){
        System.out.println("You chose hot milk for breakfast");
    }
}
class ColdMilk implements Milk{
    public void getDetails(){
        System.out.println("You chose cold milk for breakfast");
    }
}
//abstract factory
interface DrinkForBreakfast{
    public Coffee ChoLyCaPhe();
    public Milk ChoLySua();
 }
//concrete first factory
class HotDrink implements DrinkForBreakfast{
    public Coffee ChoLyCaPhe(){
        return new HotCoffee();
    }
    public Milk ChoLySua(){
        return new HotMilk();
    }
}
//concrete second factory
class ColdDrink implements DrinkForBreakfast{
    public Coffee ChoLyCaPhe(){
        return new ColdCoffee();
    }
    public Milk ChoLySua(){
        return new ColdMilk();
    }
}
//Application class
class Application{
    public Coffee cafe;
    public Milk sua;

    Application(DrinkForBreakfast drink){
        this.cafe = drink.ChoLyCaPhe();
        this.sua = drink.ChoLySua();
    }
    public void getDetails(){
        this.cafe.getDetails();
        this.sua.getDetails();
    }
}
class AbstractFactory{
    public static void main(String[] args){
        DrinkForBreakfast drink = new ColdDrink();
        Application app = new Application(drink);

        app.getDetails();

        
    }
}