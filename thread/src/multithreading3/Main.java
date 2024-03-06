package multithreading3;
//annonimus inner class


public class Main {

public static void main(String[] args) throws Exception{
        Runnable ob1 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10;i++){
                    System.out.println("hi");
                    try{Thread.sleep(1000);}catch (Exception e){}
                }
            }
        };

        Runnable ob2 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10;i++){
                    System.out.println("Hello !");
                    try{Thread.sleep(1000);}catch (Exception e){}
                }
            }
        };

        //pass the runnable object to a thread
    Thread t1 = new Thread(ob1);
    Thread t2 = new Thread(ob2);

    t1.start();
    try{Thread.sleep(100);}catch (Exception e){}
    t2.start();

    }
}
