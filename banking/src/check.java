public class check extends BankAccount {

    public check(int number,
                 int balance,
                 String customerName,
                 String emailPhone){
        //i just put super for practice
        //c how you have to declare it before the class variables within a constructor
        super(5);
        //this will put values into the super class variables
        super.setNumber(number);
        setBalance(balance);
        setCustomerName(customerName);
        setEmailPhone(emailPhone);

    }

    //this is to check values
    public void printvalues(){
        //this will show the numbers
        System.out.println("id :"+getNumber());
        System.out.println("balance :"+getBalance());
        System.out.println("customerName :"+getCustomerName());
        System.out.println("Enter emailPhone :"+emailPhone());
    }
    //function to reduce amount of cash
    public void reduceCash(int amount) {
        //check balance
        setBalance(getBalance() - amount);
    }
    check(){};
}

