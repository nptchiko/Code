class compilebycml {
    public static void main(String[] args){

    //on command line:
    // javac compilebycml.java
    // java compilebycml. java hello world
        if(args.length > 0){
            for(String a : args){
                System.out.print(a + " ");
            }
        } 
    }    
}
