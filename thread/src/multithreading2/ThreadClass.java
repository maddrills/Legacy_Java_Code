package multithreading2;

public class ThreadClass {
    public static void main(String[] args){
        //to run both strings
/*        Runnable obj1 = new Hi();
        Runnable obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try{Thread.sleep(100);}catch (Exception e){}
        t2.start();*/

        new Hello();
        try{Thread.sleep(100);}catch (Exception e){}
        new Hi();

    }
}
