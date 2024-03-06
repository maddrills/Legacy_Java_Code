package multithreading2;

public class Hello implements Runnable{
    public Hello(){
        Thread t1 = new Thread(this,"hello thread");
        t1.start();
    }
    public void run(){
        for(int i = 0; i < 5;i++){
            System.out.println("hello");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
