import java.io.InputStream;
import java.util.*;

class Scanner_Next {
    public static void main(String[] args) throws Exception{

        try{
            // String line = "1 + 1 = 3";
            // Scanner scanner = new Scanner(line);
            // System.out.println(scanner.nextInt());
            // System.out.println(scanner.next());
            // scanner.close();

            // InputStream in = System.in;
            // Scanner scanner = new Scanner(in);
            // System.out.print(scanner.next());
            // scanner.close();

           // String line = "1 + 11 = 3";
           // radix here is base like 2, 8, 16
           // result is the numberal order of nextInt() in base radix equivalent of base 10
           // 11 in base 5 equals to 6 in base 10 
            //System.out.println(scanner.nextLine(radix));
           // System.out.println(scanner.next());

            Scanner scanner = new Scanner(System.in /*line */);
            int a = scanner.nextInt();
            //String x = scanner.nextLine();
            //scanner.nextLine();
            String line = scanner.nextLine();

            System.out.print(a +"kocogiogiua" +line);
             
           

        } catch (Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
