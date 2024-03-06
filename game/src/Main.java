import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Monster ob2 = new Monster("roch",55,100);
    private static Scanner input = new Scanner(System.in);
    static ISaveable ob = new Player("mat",3,5);
    public static void main(String[] args){
        //main call
        System.out.println(ob);
        process(ob);
        System.out.println(ob);

        System.out.println(ob2);
        process(ob2);
        System.out.println(ob2);
    }

    public static void process(ISaveable arr){
        List<String> arrayList = new ArrayList();
        for(int i=0; i < arr.write().size(); i++){
            System.out.println("Enter the field for "+i);
            String goinIn = input.nextLine();
            arrayList.add(i,goinIn);
        }
        arr.read(arrayList);
    }
}
