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

class Engine{}
class GPS{}
public class Ex_Builder {
    
}
