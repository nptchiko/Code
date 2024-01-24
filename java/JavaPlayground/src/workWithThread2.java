public class workWithThread2 implements Runnable{
    public static workWithThread2 obj;
    public static Thread mainThread;

    public static void main(String[] args){
        obj = new workWithThread2();
        mainThread = new Thread(obj, "mainThread");

        System.out.println("The status of main thread after creating: " + mainThread.getState()); 

        mainThread.start(); //mainThread revoke the run() method of this class

        System.out.println("The status of main thread after calling start(): " + mainThread.getState());
        System.out.println("Current thread: " + Thread.currentThread().getName());
    }
    public void run(){
        subThread mine = new subThread();
        Thread subThread = new Thread(mine, "subThread");

        System.out.println("Current thread: " + Thread.currentThread().getName());

        System.out.println("The status of sub thread after creating: " + subThread.getState());

        subThread.start();

        System.out.println("Current thread: " + Thread.currentThread().getName());

        System.out.println("The status of sub thread after calling start(): " + subThread.getState());

         try{
            Thread.sleep(2200);

        } catch (InterruptedException e){
            e.printStackTrace();
        } 

        System.out.println("The status of sub thread after main THread calling sleep(): " + subThread.getState());

        System.out.println("Current thread: " + Thread.currentThread().getName());

        try{
            
            subThread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The status of sub thread after calling join(): " + subThread.getState());

        System.out.println("The status of main thread after subThread terminated: " + mainThread.getState());
    }
    
}

class subThread implements Runnable {
    public void run() {

        System.out.println("-Current thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(220);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The status of Main thread while call sleep(2200) in subthread: "
        + workWithThread2.mainThread.getState());

        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The status of sub thread called sleep(200): " + Thread.currentThread().getState());
    }

}