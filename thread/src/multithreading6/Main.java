package multithreading6;

class counter{
    int count;
    public synchronized void inc(){
        //try{Thread.sleep(100);}catch (Exception e){};
        this.count +=1;
    }
}
public class Main {
    //now i want it to increment along two threads
    public static void main(String[] args) throws Exception{

        counter obj = new counter();

        Thread t1 = new Thread(()->{
                for(int i =0; i< 10000; i++){
                    obj.inc();
                }
            }//Runnable -> run() ->
        );

        Thread t2 = new Thread(() ->{
            for(int i =0; i< 10000; i++){
                obj.inc();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(obj.count);
    }
}
