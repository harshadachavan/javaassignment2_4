package firstquestion;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter physics marks :");
		int p = sc.nextInt();
		
		System.out.println("Enter chem marks :");
		int c = sc.nextInt();
		System.out.println("Enter math marks :");
		int m = sc.nextInt();
		
		if(p < 0 || c < 0 || m < 0 )
		{
			System.out.println("You have entered invalid marks");
		}
		
		else
		{
			int avg = (p+c+m) / 3;
			
			if(avg > 70)
			{
				System.out.println ("you have received A grade");
			}
			else if(avg > 61 && avg <= 70)
			{
				System.out.println ("you have received B grade");
			}
			else
			{
				System.out.println ("you have received C grade");
			}
		}
		sc.close();
	}

}
