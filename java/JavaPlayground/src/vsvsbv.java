import java.util.*;

class Test{
    private ArrayList<ArrayList<Integer>> list;

    Test(){
        this.list = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < 4; i++){
            list.add(new ArrayList<Integer>());
            for(int j = 0; j < 4; j++){
                list.get(i).add(1);
            }
        }
    }
   
    public void setR(){
        int n = (int)(Math.random()*10);
         this.list.get(0).get(0).
   }
}
class vsvsbv{
    
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> grid = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> res = new ArrayList<Integer>();

        for(int i=0; i<5; i++){
            grid.add(new ArrayList<Integer>());
        }
        for(int i=0; i<4; i++){            
            for(int j=0; j<grid.size(); j++){
                grid.get(i).add(5);
            }
        }
        
        Test t = new Test();
        t.setR();

        System.out.println("pass");
    }
}
