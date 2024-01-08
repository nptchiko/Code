import java.util.*;

class sudoku {
    public static void main(String[] args) {
        Solution so = new Solution();
        so.Result();
    }
}

class Solution {
    private int[][] m;
    private int[][] key;
    private boolean[][] box_check;
    private boolean[][] isAlready;
    private boolean hasSolution;
    private int count;

    public boolean isValid(int a, int b, int temp_V) {

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

    public void print(int[][] m) {
        System.out.println("");
        for (int k = 0; k < 9; k++) {
            for (int j = 0; j < 9; j++)
                System.out.print(m[k][j] + " ");
            System.out.println("");
        }
    }

    private void Init() {
        try (Scanner sc = new Scanner(System.in)) {
            count = 54; hasSolution = false;
            m = new int[9][9];
            key = new int[9][9];
            box_check = new boolean[50][50];
            isAlready = new boolean[50][50];

            for (int i = 0; i <= 9; i++)
                for (int j = 0; j <= 9; j++) {
                    box_check[i][j] = false;
                    isAlready[i][j] = false;
                }

            for (int i = 0; i < 9; i++)
                for (int j = 0; j < 9; j++) {
                    m[i][j] = 0;
                }
        }
    }
    public void Fill(int m, int n){
        int rank = 3; int temp = rank*((m/rank + 1));
        
        for(int i = m; i < temp; i++){
            for(int j = n; j < temp; j++){
                int rand = (int)(Math.random()*9 + 1);
                while(isValid(i, j, rand) == false){
                    rand = (int)(Math.random()*9 + 1);
                }
                box_check[3 * (i / 3) + j / 3][rand] = true;
                this.m[i][j] = rand; isAlready[i][j] = true;
            }
        }
       
    }
    public void Generate(int k){
        this.Init();{
            for(int i = 0; i < 7; i += 3){
                Fill(i, i);
            }
        }
        solve(-1); 
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++)
                m[i][j] = key[i][j];

        while(--k >= 0 ){
            int i = (int)(Math.random()*9);
            int j = (int)(Math.random()*9);
            m[i][j] = 0;
        }
    }

    public void solve(int k) {
        int x = (k + 1) / 9;
        int y = (k + 1) % 9;

        if(hasSolution == true) return;
        if (count == 0) {
            
            for(int i = 0; i < 9; i++)
                for(int j = 0; j < 9; j++)
                    key[i][j] = m[i][j];
            hasSolution = true ;return;
        }
        if (isAlready[x][y] == true) {
            solve(k+1);
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (isValid(x, y, i)) {
                box_check[3 * (x / 3) + y / 3][i] = true;
                m[x][y] = i;
              
                count--;

                solve(k + 1);

                box_check[3 * (x / 3) + y / 3][i] = false;
                m[x][y] = 0;
            
                count++;
            }
        }

    }

    public void Result() {
        
        Generate(20 + (int)(Math.random()*50)); print(m); print(key);
    }

}
