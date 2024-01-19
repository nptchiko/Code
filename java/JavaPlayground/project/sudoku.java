import java.util.*;
class sudoku {
    public static void main(String[] args){
        Solution so = new Solution();
        so.run();
    }
}

class Game {
    private int[][] m;
    private int[][] key;
    private boolean[][] box_check;
    private boolean[][] isAssigned;
    private boolean hasSolution;
    private int counter;

    
    private boolean isValid(int a, int b, int temp_V) {

        for (int i = 0; i < 9; i++)
            if (m[a][i] == temp_V && i != b)
                return false;
        for (int i = 0; i < 9; i++)
            if (m[i][b] == temp_V && i != a)
                return false;

        if (box_check[3 * (a / 3) + b / 3][temp_V] == false && m[a][b] == 0)
            return true;
        return false;
    }
    private void fill(int m, int n){
        int rank = 3; int temp = rank*((m/rank + 1));
        
        for(int i = m; i < temp; i++){
            for(int j = n; j < temp; j++){
                int rand = (int)(Math.random()*9 + 1);
                while(isValid(i, j, rand) == false){
                    rand = (int)(Math.random()*9 + 1);
                }
                box_check[3 * (i / 3) + j / 3][rand] = true;
                this.m[i][j] = rand; isAssigned[i][j] = true;
            }
        }
       
    }
    public void UIprinter(int[][] m) {
        System.out.println("");
        for (int k = 0; k < 9; k++) {
            for (int j = 0; j < 9; j++)
                System.out.print(m[k][j] + "  ");
            System.out.println('\n');
        }
    }

    public void Initializator() {
    
            counter = 54; hasSolution = false;
            m = new int[9][9];
            key = new int[9][9];
            box_check = new boolean[50][50];
            isAssigned = new boolean[50][50];

            for (int i = 0; i <= 9; i++)
                for (int j = 0; j <= 9; j++) {
                    box_check[i][j] = false;
                    isAssigned[i][j] = false;
                }

            for (int i = 0; i < 9; i++)
                for (int j = 0; j < 9; j++) {
                    m[i][j] = 0;
                }
    }
    public void generator(int k){
        this.Initializator();;
        for(int i = 0; i < 7; i += 3){
                fill(i, i);
        }
        
        this.solver(-1); 
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++)
                m[i][j] = key[i][j];

        this.counter = k;
        while(--k >= 0 ){
            int i = (int)(Math.random()*9);
            int j = (int)(Math.random()*9);
            m[i][j] = 0;
        }
    }

    public void solver(int k) {
        int x = (k + 1) / 9;
        int y = (k + 1) % 9;

        if(hasSolution == true) return;
        if (counter == 0) {
            
            for(int i = 0; i < 9; i++)
                for(int j = 0; j < 9; j++)
                    key[i][j] = m[i][j];
            hasSolution = true ;return;
        }
        if (isAssigned[x][y] == true) {
            this.solver(k+1);
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (isValid(x, y, i)) {
                box_check[3 * (x / 3) + y / 3][i] = true;
                m[x][y] = i;
              
                counter--;

                this.solver(k + 1);

                box_check[3 * (x / 3) + y / 3][i] = false;
                m[x][y] = 0;
            
                counter++;
            }
        }

    }
    



  public void run(){

        this.generator(2);// + (int)(Math.random()*30));

        int i, j;

        this.UIprinter(m);
      try ( Scanner sc = new Scanner(System.in)){        

        while(this.counter > 0){
            System.out.println("Input(1->9): ");

           i = (int)(sc.next().charAt(0)) - 48;

           j = (int)(sc.next().charAt(0)) - 48;




            System.out.println("Input: " + i + " " + j);

                if(this.m[i-1][j-1] != 0){
                    System.out.println("Input is already assigned");

                } else {
                    System.out.println("Insert value: ");
                    this.m[i-1][j-1] = sc.nextInt();
                    
                    if(m[i-1][j-1] != key[i-1][j-1]){
                    	  System.out.println("Wrong Answer "  + '\n' + "NONNNN");
                    	  m[i-1][j-1] = 0;

                    } else {
                    	this.counter--; 
                    }
                }
            this.UIprinter(m);
        }

        } catch(InputMismatchException e) {
            e.printStackTrace();
        } 

    }
}
    /*   System.out.print("\033[H\033[2J");  
        System.out.flush();  

class User {
    private Game game;
    private int level;

    User(){
        this.game.Initializator();
        this.level = 0;
    }
    public void play(){

    }
}
*/