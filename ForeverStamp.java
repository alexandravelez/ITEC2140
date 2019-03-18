import java.util.Scanner;
public class ForeverStamp 
{ 
	public static void main (String[] args) 
	{ 
		//Prompts the user to enter the weight in ounces
		Scanner input = new Scanner (System.in);
		System.out.print("Enter weights in ounce for letters to mail out. When done entering, please enter -1 to finish: ");
		double ounce = input.nextDouble();

		//Checks to see if user is entering -1, then proceeds to see if forever stamp can be used.
		while (ounce != -1) 
		{
			//Allows forever stamp to be used, since weight entered is less than 1
			if (ounce < 1) 
			{
				System.out.println("You can use forever stamp.");
				System.out.print("Enter weights in ounce for letters to mail out. When done entering, please enter -1 to finish: ");
				ounce = input.nextDouble();
			}
			
			//Tells the user that they need an additional postage since their weight is over 1
			else 
			{
				System.out.println("You need additional postage than a forever stamp");
				System.out.print("Enter weights in ounce for letters to mail out. When done entering, please enter -1 to finish: ");
				ounce = input.nextDouble();
			}
		}
		
		//When -1 is entered, it will not run the while loop and go print 'Good Bye!!'
		System.out.println("Good bye!!");
	}	
}
