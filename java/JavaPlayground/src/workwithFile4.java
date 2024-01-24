import java.util.*;
import java.io.*;

class workwithFile4{
    public static void main(String[] args) throws IOException{
   
        //copy file
        File origin = new File("text.txt");
        File des = new File("text2.txt");
        
        FileInputStream in = new FileInputStream(origin);
        FileOutputStream out = new FileOutputStream(des);

        int n;
        while((n = in.read())!= -1){
            out.write(n);
        }

    }
}