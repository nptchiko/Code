class Solve{
    private int[] a;
    private int n;
    private int count;

    Solve(){
        this.n = 0;
    }
    public void set_N(int n){
        this.n = n;
        this.a = new int[n+1];
        this.count = 0;
    }
    public void print(){
        for(int i=0; i < n; i++) System.out.print(a[i] + " ");
        System.out.println();
    }
    public int get_Count(){ return this.count;}
    public void solve(int k){
        for(int i = 1; i <= 8; i++){
            if(k <= (n-1)/2){
                a[k] = i; a[n - k - 1] = i;
                if(k == (n-1)/2){
                    print(); count++;
                } else solve(k + 1);
            }
            
        }
    }
}

class solution_for_random_prob_2{
    public static void main(String[] args){
        Solve s = new Solve();
        s.set_N(10); s.solve(0); 
        System.out.print(s.get_Count());
    }

}