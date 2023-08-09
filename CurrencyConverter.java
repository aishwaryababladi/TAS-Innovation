package tas;
import java.util.*;
public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount to be converted: ");
		double amt = sc.nextDouble();
		
		System.out.println("Enter the source currency: ");
		String src = sc.next().toUpperCase();
		
		
		switch(src) {
		case "INR":
			System.out.println("Enter the target currency: ");
			String tar = sc.next().toUpperCase();
			
			switch(tar) {
			case "USD":
				double tot = amt*0.012;
				System.out.println(amt+" INR = "+tot+" USD");
				break;
			case "EUR":
				double tot2 = amt*0.011;
				System.out.println(amt+" INR = "+tot2+" EUR");
				break;
			case "JPY":
				double tot3 = amt*1.73;
				System.out.println(amt+" INR = "+tot3+" JPY");
				break;
			}
			break;
			
		case "USD":
			System.out.println("Enter the target currency: ");
			String tar2 = sc.next().toUpperCase();
			
			switch(tar2) {
			case "INR":
				double tot = amt*82.85;
				System.out.println(amt+" USD = "+tot+" INR");
				break;
			case "EUR":
				double tot2 = amt*0.91;
				System.out.println(amt+" USD = "+tot2+" EUR");
				break;
			case "JPY":
				double tot3 = amt*143.65;
				System.out.println(amt+" INR = "+tot3+" JPY");
				break;
			default:
				System.out.println("Invalid target!");
			}
			break;

		case "EUR":
			System.out.println("Enter the target currency: ");
			String tar3 = sc.next().toUpperCase();
			
			switch(tar3) {
			case "INR":
				double tot = amt*90.92;
				System.out.println(amt+" EUR = "+tot+" INR");
				break;
			case "USD":
				double tot2 = amt*1.10;
				System.out.println(amt+" EUR = "+tot2+" USD");
				break;
			case "JPY":
				double tot3 = amt*157.68;
				System.out.println(amt+" EUR = "+tot3+" JPY");
				break;
			}
			break;
			
		case "JPY":
			System.out.println("Enter the target currency: ");
			String tar4 = sc.next().toUpperCase();
			
			switch(tar4) {
			case "INR":
				double tot = amt*0.58;
				System.out.println(amt+" JPY = "+tot+" INR");
				break;
			case "USD":
				double tot2 = amt*0.0070;
				System.out.println(amt+" JPY = "+tot2+" USD");
				break;
			case "EUR":
				double tot3 = amt*0.0063;
				System.out.println(amt+" JPY = "+tot3+" EUR");
				break;
			}
			break;

		default:
			System.out.println("Invalid source!");
		}
	}

}
