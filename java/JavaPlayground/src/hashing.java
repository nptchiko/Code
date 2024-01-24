import java.util.*;

interface HandleCollision {
    void insert(int k);

    void delete(int k);

    void display();
}

class Seperate_Chaining implements HandleCollision {
    private final int n;
    private final ArrayList<ArrayList<Integer>> table;

    public Seperate_Chaining(int n) {
        this.n = n;
        this.table = new ArrayList<ArrayList<Integer>>(n);

        for (int i = 0; i < n; i++)
            table.add(new ArrayList<>());
    }

    public int hash_function(int key) {
        return key % n;
    }

    public void insert(int key) {
        int i = hash_function(key);
        table.get(i).add(key);
    }

    public void delete(int key) {
        int i = hash_function(key);
        if (table.get(i).contains(key)) {
            table.get(i).remove(key);
        }
    }

    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(i);
            for (int x : table.get(i))
                System.out.print(" ----> " + x);
            System.out.println();
        }
    }
}

class hashing {
    public static void main(String[] args) {
        Seperate_Chaining s = new Seperate_Chaining(5);
        int[] a = { 5, 12, 43, 23, 77 };
        for (int i : a)
            s.insert(i);
        s.display();
    }
}
