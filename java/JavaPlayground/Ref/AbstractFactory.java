enum productBrand{
    Yonex, Lightning, Victor
}
enum Location{
    HoChiMinh_city, HaNoi_city, LongXuyen_city
}
abstract class BadmintonRacketBrand{   
        
    BadmintonRacketBrand(productBrand brand, Location location){
        this.brand = brand;
        this.location = location;
    }
    
    public abstract void connect();

    productBrand brand = null;
    Location location = null;

    @Override
    public String toString(){
        return "Calling for branch at " + this.location + " - Order for " + this.brand;
    }

}
class Yonex extends BadmintonRacketBrand{
    Yonex(Location location){
        super(productBrand.Yonex, location);
        connect();
    }
    public void connect(){
        System.out.println("Connecting to order " + this.brand);
    }
}
class Lightning extends BadmintonRacketBrand{
    Lightning(Location location){
        super(productBrand.Lightning, location);
        connect();
    }
    public void connect(){
        System.out.println("Connecting to order " + this.brand);
    }
}
    
class Victor extends BadmintonRacketBrand{
    Victor(Location location){
        super(productBrand.Victor, location);
        connect();
    }
    public void connect(){
        System.out.println("Connecting to order " + this.brand);
    }
}
abstract class Branch{

     Branch(){}

    static BadmintonRacketBrand order(productBrand product, Location location){
        BadmintonRacketBrand brand = null;

        switch(product){
            case productBrand.Yonex:
                brand = new Yonex(location);
            break;
            case productBrand.Lightning:
                brand = new Lightning(location);
            break;
            case productBrand.Victor:
                brand = new Victor(location);
            break;
            default:
            break;
        }
        return brand;
    }

}
class HoChiMinh_branch extends Branch{
    static BadmintonRacketBrand order(productBrand product){
        return Branch.order(product, Location.HoChiMinh_city);
    }
}
class HaNoi_branch extends Branch{
    static BadmintonRacketBrand order(productBrand product){
        return Branch.order(product, Location.HaNoi_city);
    }
}
class LongXuyen_branch extends Branch{
    static BadmintonRacketBrand order(productBrand product){
        return Branch.order(product, Location.LongXuyen_city);
    }
}

class BadmintonFactory{

    private BadmintonFactory() {}

    static BadmintonRacketBrand orderRack(productBrand brand){
        Location location = Location.LongXuyen_city;
        BadmintonRacketBrand temp = null;

        switch(location){
            case Location.LongXuyen_city:
                temp = LongXuyen_branch.order(brand);
            break;
            case Location.HaNoi_city:
                temp = HaNoi_branch.order(brand);
            break;
            case Location.HoChiMinh_city:
                temp = HoChiMinh_branch.order(brand);
            break;
            default:
            break;
        }
        return temp;
    }
}
class AbstractFactory{
    public static void main(String[] args){
        System.out.println(BadmintonFactory.orderRack(productBrand.Yonex));
        System.out.println(BadmintonFactory.orderRack(productBrand.Victor));
        System.out.println(BadmintonFactory.orderRack(productBrand.Lightning));

    }
}