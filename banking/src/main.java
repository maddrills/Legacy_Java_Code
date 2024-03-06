import java.util.Scanner;

public class main{

    public static void main(String args[]){
        int number;
        int balance;
        String customerName;
        String emailPhone;
        int input = 0;

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter id");
        number = ob.nextInt();
        System.out.println("Enter balance");
        balance = ob.nextInt();
        System.out.println("Enter customerName");
        customerName = ob.next();
        System.out.println("Enter emailPhone");
        emailPhone = ob.next();

        check ob1 = new check(number,balance,
                customerName,emailPhone);
        ob1.printvalues();

        // reduce amount

        //this will provide with an option
        while(true) {
            System.out.println("1 to reduce amount");
            System.out.println("2 to display amount");
            System.out.println(" any number to exit ");

            input = ob.nextInt();
            int amount =0;

            switch (input) {
                case 1:
                    System.out.println("enter amount");
                    amount = ob.nextInt();
                    if (amount > ob1.getBalance() || amount < 1) {
                        continue;
                    }
                    ob1.reduceCash(amount);
                    continue;
                case 2:
                    ob1.printvalues();
                    continue;
                default:
                    break;
            }
            break;
        }
    }
}
