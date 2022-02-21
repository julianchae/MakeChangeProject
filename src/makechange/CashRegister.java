package makechange;
import java.util.Scanner;
public class CashRegister {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double priceOfitem, paymentAmount, change;
		int twentybills = 0;
		int tenbills = 0;
		int fivebills = 0;
		int onebills = 0;
		int quarters = 0;
		int dimes = 0;
		int nicks = 0;
		int pennies = 0;
		System.out.println("Customer, how much is the item in hand?");
		priceOfitem = kb.nextDouble();
		System.out.println("How much money do you have?");
		paymentAmount = kb.nextDouble();
		change = paymentAmount - priceOfitem;
		if (priceOfitem == paymentAmount) {
			System.out.println("You have chosen to pay with exact change! Thank you. ");
		}
		else if (priceOfitem > paymentAmount) {
			System.out.println("Sorry, you do not have enough money, please try again.");
		} else {
			
			System.out.println("Price of item : "+priceOfitem+"\nAmount paid : "+ paymentAmount);
			
			while (change >= 20.00) {
				change = change - 20.00;
				twentybills++;
			}
			if (twentybills !=0)
				System.out.println("Your change includes : " + twentybills + " twenty dollar bill(s).");
			while (change >= 10.00) {
				change = change - 10.00;
				tenbills++;
			}
			if(tenbills!=0)
			System.out.println("Your change includes : " + tenbills + " ten dollar bill(s).");
		}
		while (change >= 5.00) {
			change = change - 5.00;
			fivebills++;
		}
		if(fivebills!=0)
		System.out.println("Your change includes : " + fivebills + " five dollar bill(s).");
		while (change >= 1.00) {
			change = change - 1.00;
			onebills++;
		}
		if(onebills!=0)
		System.out.println("Your change includes : " + onebills + " one dollar bill(s).");
		change += 0.005;
		change = (int) (change * 100);
		while (change >= 25) {
			change = change - 25;
			quarters++;
		}
		if(quarters!=0)
		System.out.println("Your change includes : " + quarters + " quarter(s).");
		while (change > 10) {
			change = change - 10;
			dimes++;
		}
		if(dimes!=0)
		System.out.println("Your change includes : " + dimes + " dimes(s).");
		while (change > 5) {
			change = change - 5;
			nicks++;

		}
		if(nicks!=0)
		System.out.println("Your change includes : " + nicks + " nickel(s).");
		while (change >= 1) {
			change = change - 1;
			pennies++;
		}
		if(pennies!=0)
		System.out.println("Your change includes : " + pennies + " penny(s).");
	}
}