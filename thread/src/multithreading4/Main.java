package multithreading4;

public class Main {
    //lambda using the interface Runnable
    public static void main(String[] args) throws Exception{
        Runnable ob1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i += 1) {
                    System.out.println("Hi  ooooo");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };

        Runnable ob2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i += 1) {
                    System.out.println("Hello ");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };

        //thread
        Thread ti = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        ti.start();
        try{Thread.sleep(100);}catch(Exception e){}
        t2.start();
    }
}
