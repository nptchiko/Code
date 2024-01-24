import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.io.InputStreamReader;

class bufferedReader{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int c = (int)(reader.read()) - 48;
        if(c < 0) c = 0; // read character
   //     long l = Long.parseLong(reader.readLine());

        System.out.println(c);



        Scanner sc = new Scanner(System.in);
       //     String k = reader.readLine();
      
             String sentence = sc.nextLine();
            String word = sc.next();
         //   System.out.println(k);
            System.out.println("Word: " + word + "\n" + "Sentence: " + sentence);
        sc.close();
            
        }

}
