import java.util.Scanner;

public class age {

    public static void main(String a[]){
        int age = 0;
        Scanner ob = new Scanner(System.in);
        print("enter age");
        age = ob.nextInt();

        //sanity check
        if(age < 100 && age > 0){
            //logic
            if(age < 18){
                print("under");
            }
            else{
                print("welcome to the club");
            }
        }
        else{
            print("Invalid");
        }
    }
    //I got tired of System.out.println so i made it a method call
    public static void print(String st){
        System.out.println(st);
    }
}
