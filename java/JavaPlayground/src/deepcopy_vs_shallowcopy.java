import java.util.*;

class DeepCopy{
    private final int i;
    private final HashMap<String, String> mp;

    public DeepCopy(int i, HashMap<String, String> mp){
        this.i = i; this.mp = new HashMap<String, String>(mp);
    }
    public int getId(){ return this.i;}
    public HashMap<String, String> getmp(){ return (HashMap<String, String>)this.mp.clone(); }
}
class ShallowCopy{
    private final int i;
    private final HashMap<String, String> mp;

    public ShallowCopy(int i, HashMap<String, String> mp){
        this.i = i; this.mp = mp;
    }
    public int getId(){ return this.i;}
    public HashMap<String, String> getmp(){ return this.mp; }
}

class deepcopy_vs_shallowcopy {
    public static void main(String[] args){
        int i = 12;
        HashMap<String, String> mp = new HashMap<String, String>();
        mp.put("1", "lamo");
        mp.put("2", "haha");

        ShallowCopy shallowCopy = new ShallowCopy(i, mp);
        DeepCopy deepCopy = new DeepCopy(i, mp);

        System.out.println("Before changing values: ");
        System.out.println("Shallow Copy: ");
        System.out.println("i = " + shallowCopy.getId() + "\n"+ "Mp = " + shallowCopy.getmp());
        System.out.println("Deep Copy: ");
        System.out.println("i = " + deepCopy.getId() + "\n"+ "Mp = " + deepCopy.getmp());


        i = 10; mp.put("3", "bruh");

        System.out.println("After changing values: ");
        System.out.println("Shallow Copy: ");
        System.out.println("i = " + shallowCopy.getId() + "\n"+ "Mp = " + shallowCopy.getmp());
        System.out.println("Deep Copy: ");
        System.out.println("i = " + deepCopy.getId() + "\n"+ "Mp = " + deepCopy.getmp());

    }
}
