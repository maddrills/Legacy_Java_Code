package multithreading7;

public class Customer implements Runnable{
    //create a class reference to Product
    Product p;
    public Customer(Product p){
        this.p = p;
        Thread ob = new Thread(this,"Consumer or customer thread");
        ob.start();
    }
    //now display the customers consumed

    @Override
    public void run() {
        while (true) {
            //display the product class amount
            p.getAmount();
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
