package multithreading2;

public class Hi implements Runnable{
    public Hi(){
        Thread t1 = new Thread(this,"hi thread");
        t1.start();
    }
    public void run(){
        for(int i = 0; i < 5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
