public class BankAccount {
    //member variables
    public static int num;
    private int number;
    private int balance;
    private String customerName;
    private String emailPhone;
    //setter
    public void setNumber(int number){
        this.number = number;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmailPhone(String emailPhone){
        this.emailPhone = emailPhone;
    }

//    getter for number
    public int getNumber(){
        return this.number;
    }
//    getter for balance
    public int getBalance(){
        return this.balance;
    }
//    getter for customerName
    public String getCustomerName(){
        return this.customerName;
    }
//    getter for customerName
    public String emailPhone(){
        return this.emailPhone;
    }
    public BankAccount(int num){
        this.num = num;
    }
    BankAccount(){}
}
