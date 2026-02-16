/*

🧩 Mini Project — Bank Account Management System

Built a Console-Based Bank Account System using Java OOP concepts.
Implemented account creation with PIN authentication, deposit, withdraw, and balance check using a menu-driven interface.

*/

import java.util.*;
class BankAccount {
	private String accountHolder;
	private String accountNumber;
	private double balance = 0;
	private int pin;
	Scanner scanner = new Scanner(System.in);

	BankAccount(String accountHolder, int accountNumber) {
		createAccount(accountHolder, accountNumber);
	}

	void createAccount(String accountHolder, int accountNo) {
		this.accountHolder = accountHolder;
		accountNumber = "ACC" + accountNo;

		System.out.print("Enter a 4 digit PIN : ");
		while(true) {
			int pass = scanner.nextInt();
			if(pass >= 1000 && pass <= 9999) {
				pin = pass;
				System.out.println("Account Created Successful " + accountHolder + ", your AccountNo is " + accountNumber);
				break;
			}
			System.out.println("Enter valid 4 digit PIN");
		}
	}

	void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.printf("%s deposited %.2f\n", accountHolder, amount);
		}
		else
			System.out.println("Invalid Amount");
	}

	void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.printf("%s withdrew %.2f\n", accountHolder, amount);
		}
		else
			System.out.println("Insufficient Balance");
	}

	boolean verifyPin(int inputPin) {
		return inputPin == pin;
	}


	void showBalance() {
		System.out.printf("%s having %.2f\n", accountHolder, balance);
	}


}

public class Main
{
	static int accNoGen = 1000;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount account = null;

		while(true) {
			System.out.println("\nA) New user ");
			System.out.println("B) Login");
			System.out.println("C) Exit");
			System.out.print("Choose any Option (A / B / C) : ");

			char start = scanner.nextLine().toLowerCase().charAt(0);

			if(start == 'a') {
				System.out.print("Enter your name : ");
				String name = scanner.nextLine();
				account = new BankAccount(name, accNoGen);
				accNoGen++;
			}
			else if(start == 'b') {
				if(account == null)
					System.out.println("No account found. Create account first.");
				else {

					System.out.print("Enter PIN : ");
					int pinInput = scanner.nextInt();
					scanner.nextLine();

					if(account.verifyPin(pinInput)) {

						while(true) {

							System.out.println("\n1 Deposit");
							System.out.println("2 Withdraw");
							System.out.println("3 Check Balance");
							System.out.println("4 Logout");
							System.out.print("Choose any Option : ");

							int choice = scanner.nextInt();
							scanner.nextLine();
							System.out.println();

							if(choice == 1) {
								System.out.print("Enter amount : ");
								account.deposit(scanner.nextDouble());
								scanner.nextLine();
								System.out.println();
							}
							else if(choice == 2) {
								System.out.print("Enter amount : ");
								account.withdraw(scanner.nextDouble());
								scanner.nextLine();
								System.out.println();
							}
							else if(choice == 3)
								account.showBalance();

							else if(choice == 4) {
								System.out.println("Logged out");
								break;
							}
							else
								System.out.println("Invalid Choice");
						}
					}
					else
						System.out.println("Wrong PIN");
				}
			}
			else if(start == 'c') {
				System.out.println("Thank you!");
				break;
			}
			else
				System.out.println("Invalid Option");
		}
	}

}

/*
Output :


A) New user 
B) Login
C) Exit
Choose any Option (A / B / C) : A
Enter your name : Nikil
Enter a 4 digit PIN : 7777
Account Created Successful Nikil, your AccountNo is ACC1000

A) New user 
B) Login
C) Exit
Choose any Option (A / B / C) : B
Enter PIN : 7777

1 Deposit
2 Withdraw
3 Check Balance
4 Logout
Choose any Option : 1

Enter amount : 20000
Nikil deposited 20000.00


1 Deposit
2 Withdraw
3 Check Balance
4 Logout
Choose any Option : 2

Enter amount : 755. 0.25
Nikil withdrew 7550.25


1 Deposit
2 Withdraw
3 Check Balance
4 Logout
Choose any Option : 3

Nikil having 12449.75

1 Deposit
2 Withdraw
3 Check Balance
4 Logout
Choose any Option : 4

Logged out

A) New user 
B) Login
C) Exit
Choose any Option (A / B / C) : C
Thank you!

Link : https://onlinegdb.com/3hiiQYEuQ

*/


