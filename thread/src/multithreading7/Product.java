package multithreading7;
/*i created a class to increment every time the producer calls
* and evertime the customer consumers the product the consumed
number must be shown
*  */
public class Product {
    private int amount;
    //use by customer
    boolean flag = false;
    //used by producer
    public synchronized void incAmount(int amount){
        //if its allredy set w8
        while (flag){
            try{wait();}catch (Exception e){}
        }
        System.out.println("Produced "+amount);
        flag = true;
        this.amount = amount;
        notify();
    }
    public synchronized void  getAmount() {
            //wait while consumer is consuming
        while (!flag){
            //lock the thread
            try {wait();}catch (Exception e){}
        }
        System.out.println("consumed "+this.amount);
        flag = false;
        notify();
        //return amount;
    }

}
