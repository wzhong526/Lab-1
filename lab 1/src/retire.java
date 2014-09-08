//Winston Zhong
import java.util.Scanner;
public class retire {

public static void main(String[] args) {
		
		
		
		Scanner user_input = new Scanner(System.in); 

		int years;
		float interest;
		float interest_PMT;
		int years_to_draw;
		double income;
		double SSI;
		double pv;
		
		
		System.out.print("How many years do you want to work?: ");
		years = user_input.nextInt();
		
		System.out.print("What is the expected average return on investment?: ");
		interest = user_input.nextFloat();
		
		System.out.print("What is the annual return?: ");
		interest_PMT = user_input.nextFloat();
		
		System.out.print("How may years do you want to draw?: ");
		years_to_draw = user_input.nextInt();
		
		System.out.print("How much is the income?: ");
		income = user_input.nextDouble();
		
		System.out.print("How much will deduct off SSI?: ");
		SSI = user_input.nextDouble();
		
		
		
		pv = (income - SSI) * ((1-(1/Math.pow(1 + interest/12,(years*12)))))/(interest/12);
		
		System.out.println("The amount to save is: " + pv);
}
}