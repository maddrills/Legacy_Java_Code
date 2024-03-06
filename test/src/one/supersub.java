package one;
abstract class a {
	public void one(){
		System.out.println("one");
	}
	public void three(){
		System.out.println("three");
	}
	public void four(){
		System.out.println("four");
	}
}
class b extends a{
	public void five(){
		System.out.println("five");
	}
}
class c extends b{
	public void six(){
		System.out.println("six");
	}
}

public class supersub {
	public static void main(String a[]) {
		b ob = new b();
		ob.one();
		ob.five();
		
		a ob1 = new b();
		ob1.one();
		((b)ob1).five();
		
		c ob2 = new c();
		ob2.one();
		
		a obz = new c();
		((c)obz).six();
		((c)obz).five();
		obz.four();
	}

}
