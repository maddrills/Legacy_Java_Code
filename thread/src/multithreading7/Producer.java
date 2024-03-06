package multithreading7;

public class Producer implements Runnable{
    Product p;
    //trailing or tailing the reference pointer
    public Producer(Product p){
        this.p = p;
        Thread ob = new Thread(this,"Producer thread");
        ob.start();
    }

    @Override
    public void run() {
        int count = 0;
        while(true) {
            //increment the value of product
            p.incAmount(count++);
            try {
                Thread.sleep(1000);

            }catch (Exception e){}
        }
    }
}
