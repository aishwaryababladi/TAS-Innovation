package tas;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter the number of times to be multiplied (upto 10): ");
		int times = sc.nextInt();
		
		if(times>10) {
			System.out.println("Invalid input! Maximum number allowed for multiplication is 10!");
		}
		else if(times<=10) {
			System.out.printf("Multiplcation table of %d upto %d times: \n", num, times);
			for(int x=1; x<=times; x++) {
				int mult = num*x;
				System.out.println(num+" x "+x+" = "+mult);
			}
		}
		
		
		
		
	}

}
