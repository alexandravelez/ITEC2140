
public class SumSquare 
{
	public static void main (String [] args)
	{
		int sum = 0; 
		int multiple = 3;
		int i = 2;
		int result = 0;
		
		while (i <= 11)
		{
			 sum = (int) Math.pow(multiple, 2) + result; 
			
			//sum = multiple * i;
			
			System.out.println("Cumulation result: " + sum + "   :   " 
					+ multiple + "   :   " + multiple);
			
			result = sum +  result;
			
			multiple = multiple + 3;
			
			i = i + 1;
		}
		
		System.out.println("The SUM of Square of multiples of 3 is " + sum);
	}
}
