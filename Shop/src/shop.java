import java.util.*;

public class shop {
    public static void main(String args[]) {
        int itemNumber = 0, rate = 0, quantity = 0;
        String name = "";

        Scanner ob = new Scanner(System.in);
        while (true) {
            print("Enter item name");
            name = ob.next();

            //for empty string
            if (name == ""){
                print(inValid());
                continue;
            }
            break;
        }
        while (true) {
            print("Enter item number");
            itemNumber = ob.nextInt();

            //for less than zero inputs
            if (itemNumber < 0) {
                print(inValid());
                continue;
            }
            break;
        }
        while (true) {
            print("Enter rate");
            rate = ob.nextInt();

            //for less than zero inputs
            if (rate < 0) {
                print(inValid());
                continue;
            }
            break;
        }
        while (true) {
            print("Enter quantity");
            quantity = ob.nextInt();

            //for less than zero inputs
            if (quantity < 0) {
                print(inValid());
                continue;
            }
            break;
        }
        print("item number "+itemNumber+"with name "+name+"will cost you "+ (rate * quantity));
    }
    public static void print(String a){
            System.out.println(a);
    }
    public static String inValid(){
        return "invalid input";
    }
}
