package multithreading5;
import java.lang.Thread;
public class main {
    //extreme lambda thread
    //remeber how you need to create Runable object then pass its reference to the thread class object
    //turns out if your thread purpose is sall you can do it all in thread class itself
    public static void main(String[] args){
        //sintactic sugar
        Thread t1 = new Thread(() ->{
            for(int i = 0; i < 5; i+=1){
                System.out.println("Hi");
                try{Thread.sleep(1000);}catch (Exception e){}
            }
        },"hi Thered");

        Thread t2 = new Thread(()->{
            for(int i = 0; i < 5; i+=1){
                System.out.println("Hello");
                try{Thread.sleep(1000);}catch (Exception e){}
            }
        },"hello Thread");
        //printing the result

        t1.start();
        try{Thread.sleep(100);}catch(Exception e){}
        t2.start();
    }
}
