class Solve{
    private int[] a;
    private int n;

    Solve(){ this.n = 0;    }

    public void set_N(int n){
        this.n = n; this.a = new int[2*n];
    }
    public void print(int k){
        for(int i= 0; i < k; i++) System.out.print(a[i] + " ");
        System.out.println();
    }
    public void solve(int k){
        for(int i = 1; i <= n; i++){
            if(n - i >= 0){
                a[k] = i; n -= i;
                if(n == 0){
                    print(k+1);
                } else {
                    solve(k + 1);
                }
                a[k] = 0; n += i;
            }
        }
    }
}
class solution_for_random_prob_1{
    public static void main(String[] args){
        Solve s = new Solve();
        s.set_N(10); s.solve(0);
    }
}