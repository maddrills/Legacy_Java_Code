import java.util.Scanner;

public class swi {
    public static void main(String args[]){
        String l= "";
        //switch case
        Scanner ob = new Scanner(System.in);
        while(true) {
            print("Enter the alphabet");
            l = ob.nextLine();
            if(l.length() != 1){
                continue;
            }
            l = l.toLowerCase();
            break;
        }
        //cases
        switch (l){
            case "a":
                print(l + " is a vowel");
                break;
            case "e":
                print(l + " is a vowel");
                break;
            case "i":
                print(l + " is a vowel");
                break;
            case "o":
                print(l + " is a vowel");
                break;
            case "u":
                print(l + " is a vowel");
                break;
            default:
                print(l + " is not a vowel");

        }

    }
    private static void print(String st){
        System.out.println(st);
    }
}
