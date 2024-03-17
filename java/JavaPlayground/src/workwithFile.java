import java.io.*;

class workwithFile {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String dirName = reader.readLine();
        String dirPath = reader.readLine();

        File f = new File(dirPath, dirName);

        if(f.exists()){
            String a[] = f.list();

            for(int i  =0; i < a.length; i++){
                File f1 = new File(a[i]);
                if(f1.isFile()){
                    System.out.println(f1.getName());
                    System.out.println(": is a File");
                }
                if(f1.isDirectory()){
                    System.out.println(f1.getName());
                    System.out.println(": is a Dir");
                }
            }
            
        }
        /* input
        src
        C:\Users\ADMIN\OneDrive\Documents\Code\java\JavaPlayground\ */
        
    }
}
        

    

