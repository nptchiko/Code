import java.io.*;

public class workwithFile2 {
    public static void main(String[] args){
        workwithFile2 sample = new workwithFile2();
        sample.newFile1(); sample.newFile2();
    }
    public void newFile1(){
        String Name = ""; String Path = "";

        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Name = reader.readLine();
            Path = reader.readLine();

            File file = new File(Path+""+Name+".txt");

            FileWriter writer = new FileWriter(file);

            writer.write("You are gay");

            writer.close();

            file.createNewFile();

        } catch(Exception e){}
    }
    public void newFile2(){
        String Name = ""; String Path = "";

        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Name = reader.readLine();
            Path = reader.readLine();

            FileOutputStream file = new FileOutputStream(Path+""+Name+".txt");
            

        } catch(Exception e){}
    }
}
