enum carType {
    Sport, Mini, Limousine
}

interface Builder{
    public void setType(carType type);
    public void setSeats(int seats);
    public void setEngine(Engine engine);
    public void setGPS(GPS gps); 
}
class CarBuilder implements Builder{
    private carType type;
    private int seats;
    private Engine engine;
    private GPS gps;

    public void setType(carType type){
        this.type = type;
    }
    public void setSeats(int seats){
        this.seats = seats;
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public void setGPS(GPS gps){
        this.gps = gps;
    }
    public Car getResult(){
        return new Car(type, seats, engine, gps);
    }
}
class ManualCarBuilder implements Builder{
    private carType type;
    private int seats;
    private Engine engine;
    private GPS gps;

    public void setType(carType type){
        this.type = type;
    }
    public void setSeats(int seats){
        this.seats = seats;
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public void setGPS(GPS gps){
        this.gps = gps;
    }
    public Manual getResult(){
        return new Manual(type, seats, engine, gps);
    }
}
class Car{
    private final carType type;
    private final int seats;
    private final Engine engine;
    private final GPS gps;

    Car(carType type, int seats, Engine engine, GPS gps){
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.gps = gps;
    }
    public carType getCarType(){
        return this.type;
    }
    public int getSeats(){
        return this.seats;
    }
    public Engine getEngine(){
        return this.engine;
    }
    public GPS getGps(){
        return this.gps;
    }
}
class Manual{
    private final carType type;
    private final int seats;
    private final Engine engine;
    private final GPS gps;
    

    Manual(carType type, int seats, Engine engine, GPS gps){
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.gps = gps;

    }
    public String print(){
        String dis = "";
       
        dis += "Type of car: " + this.type + '\n' +
        "Seats: " + this.seats + '\n' +
        "Max speed: " + this.engine.getMaxV() + '\n' +
        "Acceleration: " + this.engine.getA() + '\n' +
        "GPS: " + this.gps.getRoute() + '\n';
        
        
        return dis;
    }
}
class Engine{
    private double maxV;
    private double acceleration;

    public Engine(double maxV, double acceleration){
        this.maxV = maxV;
        this.acceleration = acceleration;
    }
    public double getMaxV(){ return this.maxV;}
    public double getA(){ return this.acceleration;}
}
class GPS{
    String route;

    public GPS(String route){
        this.route = route;
    }
    public String getRoute(){ return this.route;}
}
class Director {
    public void constructSportCar(Builder builder){
        builder.setEngine(new Engine(400, 50));
        builder.setType(carType.Sport);
        builder.setGPS(new GPS("97, Man Thien, Hiep Phu, Thu Duc"));
        builder.setSeats(2);
    }
    public void constructLimousineCar(Builder builder){
        builder.setType(carType.Limousine);
        builder.setEngine(new Engine(100, 10));
        builder.setSeats(16);
        builder.setGPS(new GPS("98, Man Thien, Hiep Phu, Thu Duc"));
    }
    public void constructMiniCar(Builder builder){
        builder.setType(carType.Mini);
        builder.setEngine(new Engine(200, 20));
        builder.setSeats(4);
        builder.setGPS(new GPS("98, Man Thien, Hiep Phu, Thu Duc"));
    }
}

public class Ex_Builder {
    public static void main(String[] agrs){
        CarBuilder builder = new CarBuilder();
        ManualCarBuilder manualBuilder = new ManualCarBuilder();
        Director dir = new Director();

        dir.constructSportCar(builder);
        dir.constructSportCar(manualBuilder);

        Car car = builder.getResult();
        Manual manual = manualBuilder.getResult();

        System.out.println("You got a new " + car.getCarType() + " car");
        System.out.print("Discription: " + '\n' + manual.print());
    }
}
