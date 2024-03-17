import java.io.*;
import java.util.*;

public class workWithFile3 {
    public static void makeFile(File file){

        try {

            if(!file.exists()) file.createNewFile();

            /* or
            FileOutputStream out = new FileOutputStream(file);

             */
         } catch( IOException e ) {}
    }
    public static void writeFile(File file) {
        try {
            Scanner scanner = new Scanner(System.in);
            
        
            //write by FileWriter
                FileWriter writer = new FileWriter(file);
                String s = scanner.nextLine();
                writer.write(s);
                writer.close();    

              
           
            //write by BufferedWriter
                //BufferedWriter writer_1 = new BufferedWriter(new FileWriter(file));
                //s = scanner.nextLine();
                //writer_1.write(s);
                //writer_1.close();


        } catch( IOException e ){}

    }
    public static void readFile(File file) {
        try {    
            String read; Scanner scanner = new Scanner(System.in);
            BufferedReader reader = new BufferedReader(new FileReader(file));
        
            //read by bufferdreader
            while((read = reader.readLine()) != null){
                System.out.println(read);
            }
        //read by FileReader
             FileReader file_2 = new FileReader(file);
             int i;
             while((i = file_2.read())  != -1){
                System.out.println((char)i);
             }
        //read by Scanner
             scanner = new Scanner(file);
             while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
             }
        
            
        } catch (IOException e){}
    }
    public static void main(String[] args){
            
            //create file 
            String path = "C:\\Users\\ADMIN\\OneDrive\\Documents\\Code\\java\\JavaPlayground\\src\\";
            String name = "text";

            File file = new File(path+""+name+".txt");
            
            makeFile(file);
            writeFile(file);
            readFile(file);

        }
}
