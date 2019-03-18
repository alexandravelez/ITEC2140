
public class SumSquare {
	public static void main (String [] args){
		
		int sum = 0; 
		int multiple = 3;
		int i = 2;
		int result = 0;
		
		while (i <= 12) {
			 sum = (int) Math.pow(multiple, 2) + result; 
			
			//sum = multiple * i;
			
			System.out.printf("Cumulation result:%7d%7s%-10d%7s%-10d\n" , sum , "   :   " 
					, multiple , "   :   " , multiple);
			
			result = sum;
			
			multiple = multiple + 3;
			
			i = i + 1;
		}
		
		System.out.println("The SUM of Square of multiples of 3 is " + sum);
	}
}
