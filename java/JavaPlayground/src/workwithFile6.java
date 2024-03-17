import java.util.*;
import java.io.*;

public class workwithFile6 {
    public static void main(String[] args){

        try{
            RandomAccessFile file = new RandomAccessFile("text2.txt", "rw");
            byte[] _byte = {54,68,42,12};

            int n; String s;

           
         
         // point the pointer at index pos
            file.seek(0);

/*          while((s = file.readLine()) != null){
                System.out.print(s);
            }
*/      
/* 
         file.seek(10);
         file.write(_byte);
         file.seek(0);
*/
/*
        while((n = file.read()) != -1){
            System.out.print((char)n);
        }
*/

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
