class _backtracking{
    private int[] a;
    private int n;
    private boolean[] xet;

    _backtracking(){
        this.a = new int[100];
        this.n = 0;
        xet = new boolean[100];
    }
    public void set_N(int n){ 
        this.n = n;
        
        for(int i = 0; i <= n; i++) xet[i] = false;
    }
    public void print(int j){
        for(int i = 1; i <= j; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public void NhiPhan(int k){
        for(int i = 0; i <= 1; i++){
            a[k] = i;
            if(k == n) print(n);
            else NhiPhan(k+1);
        }
    }
    public void ToHop(int k, int chap){
        for(int i = a[k-1]; i < n - chap + k; i++){
            a[k] = i + 1;
            if(k == chap) print(chap);
            else ToHop(k + 1, chap);
        }
    }
    public void HoanVi(int k){
        for(int i = 1; i <= n; i++){
            if(xet[i] == false){
                xet[i] = true; a[k] = i;
                if(k == n) print(n);
                else HoanVi(k+1);
                xet[i] = false; 
            }
        }
    }
}

class backtracking {
    public static void main(String[] args){
        _backtracking test = new _backtracking();
        test.set_N(5); test.HoanVi(1);
        
    }
}
