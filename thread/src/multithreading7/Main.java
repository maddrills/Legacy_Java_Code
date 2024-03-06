package multithreading7;

public class Main {
    public static void main(String[] args){
        //here is the main call
        Product ob = new Product();
/*        Runnable obz = new Producer(ob);
        Thread t1 = new Thread(obz);
        t1.start();*/

        //or you cound use the shot cut where i declared and ran the thread in the cusumer interface itself
        new Producer(ob);
        new Customer(ob);

    }
}
