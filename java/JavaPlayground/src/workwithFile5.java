import java.util.*;
import java.io.*;

public class workwithFile5 {
    public static void main(String[] args) throws IOException{
        FileDescriptor drs = null;
        FileOutputStream fos = null;

        byte[] a = {71,69,69,75,83};

        try{
            fos = new FileOutputStream("text.txt");

           drs = fos.getFD();

            fos.write(a);

            drs.sync();
            fos.close();
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            if(fos!=null){
                fos.close();
            }
        }
    }
}
