package Multithreadin_program;

public class DemonThread extends Thread {
    public void run(){
        if(isDaemon()){
            System.out.println("Demon Thread is running");
        }
        else{
            System.out.println("User Thread is runnimg");
        }
    }
    public static void main(String[] args) {
        DemonThread d1 = new DemonThread();
        d1.setDaemon(true);
        d1.start();
    }
    
}
