package SmallSecond;

public class check {
	int limit;
	//constructor
	public check(int limit){
		this.limit = limit;		
	}
	//default constructor 
	public check() {}
	
	
	public int checkLarg(int aar[]) {
		int number = 0;
		int i = 0, j = 1;
			for(int k=0; k < limit - 1;k++){
				//cycle for input // recycling the same object
				if(aar[i] < aar[j]) {
					number = aar[j];
					i = j;
					j+=1;
				}
				else {
					number = aar[i];
					j+=1;					
				}
			}
		return number;
	}
	//here the value will be checked
	public int checkSmall(int aar[]) {
		int number = 0;
		int i = 0, j = 1;
			for(int k=0; k < limit - 1;k++){
				//cycle for input // recycling the same object
				if(aar[i] < aar[j]) {
					number = aar[i];
					j+=1;
					
				}
				else {
					number = aar[j];
					i = j;
					j+=1;
				}
			}
		return number;
	}
	public int checkSecondLast(int aar[]) {
		int second =0;
		int i = 0, j = 1;
			for(int k=0; k < limit - 1;k++){
				//cycle for input // recycling the same object
				if(aar[i] < aar[j]) {
					second = aar[i];
					i = j;
					j+=1;
				}
				else {
					second = aar[j];
					j+=1;					
				}
			}
		return second;
	}
}
