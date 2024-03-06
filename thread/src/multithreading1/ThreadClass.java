package multithreading1;

public class ThreadClass {
    public static void main(String[] args){
        //to run both strings
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        try{Thread.sleep(100);}catch (Exception e){}
        obj2.start();
    }
}
