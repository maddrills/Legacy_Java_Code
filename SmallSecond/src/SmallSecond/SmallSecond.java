package SmallSecond;
import java.util.*;

public class SmallSecond {
	public static void main(String a[]) {
		//main call
		//array of size n
		Scanner limit = new Scanner(System.in);
		System.out.println("enter the limit");
		int number = limit.nextInt();
		
		check object = new check(number);
		
		
		int aar[] = new int[number];
		int count = 0;
		
		for(int i:aar) {
			//cycle for input // recycling the same object
			System.out.println("enter a number");
			aar[count] = limit.nextInt();
			count+=1;
		}
		for(int i:aar) {
			System.out.print(i+" ");
		}
		System.out.println("biggest number is : "+(int)object.checkLarg(aar));
		System.out.println("small number is : "+(int)object.checkSmall(aar));
		System.out.println("biggest number is : "+(int)object.checkSecondLast(aar));
	}
}
