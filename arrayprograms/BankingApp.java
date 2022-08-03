
package arrayprograms;
import java.util.Scanner;
/**
 **4. Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a function for each of the following
1 - Generate a unique account number for each depositor
For the first depositor, account number will be BA1000, for the second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in the balance of any depositor
4 - Withdraw some amount from the balance deposited
5 - Change the address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be entered by the user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display the final information of that depositor
4 - Remove some amount from the account of any depositor and then display the final information of that depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions.
 * @author SHUBHAM
 */
class BankAccount {
private String accno;
private String name;
private String acc_type;
private long balance;
private int num;
private String address;
private int total_trans=0;
Scanner sc = new Scanner(System.in);
//method to open new account
public void AccountNum(int i){
String s;
num = 1000 + i ;
s = Integer.toString(num);
accno = "BA" + num;
System.out.print("Account created, Account no. " + accno);
System.out.println();

}




public void chng_adrs(){

String new_adrs;
System.out.print("Enter New Address: ");
new_adrs = sc.next();
address = new_adrs;
System.out.println("Address changed , new address: "+ address);


}

public void openAccount() {
System.out.print("Enter Account type: ");
acc_type = sc.next();
System.out.print("Enter Name: ");
name = sc.next();
System.out.print("Enter Balance: ");
balance = sc.nextLong();
System.out.print("Enter Address: ");
address = sc.next();

}

public void total_trans() {
System.out.println("Total Transaction: " + total_trans);

}

//method to display account details
public void showAccount() {
System.out.println("Name of account holder: " + name);
System.out.println("Account no.: " + accno);
System.out.println("Account type: " + acc_type);
System.out.println("Balance: " + balance);
System.out.println("Address: " + address);
System.out.println();
}
//method to deposit money
public void deposit() {
long amt;
System.out.println("Enter the amount you want to deposit: ");
amt = sc.nextLong();
balance = balance + amt;
total_trans += 1;
}
//method to withdraw money
public void withdrawal() {
long amt;
System.out.println("Enter the amount you want to withdraw: ");
amt = sc.nextLong();
if (balance >= amt) {
balance = balance - amt;
System.out.println("Balance after withdrawal: " + balance);
total_trans += 1;
} else {
System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
}
}
//method to search an account number
public boolean search(String ac_no) {
if (accno.equals(ac_no)) {
showAccount();
return (true);
}
return (false);
}
}
public class BankingApp {
public static void main(String arg[]) {
Scanner sc = new Scanner(System.in);
//create initial accounts
System.out.print("How many number of customers do you want to input? ");
int n = sc.nextInt();
BankAccount C[] = new BankAccount[n];
for (int i = 0; i < C.length; i++) {
C[i] = new BankAccount();
C[i].openAccount();
C[i].AccountNum(i);
}
// loop runs until number 5 is not pressed to exit
int ch;
do {
System.out.println("\n ***Banking System Application***");
System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n");
System.out.println("4. Withdraw the amount \n 5.To change Address \n 6. Check Total Transaction \n 7.Exit ");
System.out.println("Enter your choice: ");
ch = sc.nextInt();
switch (ch) {
case 1:
for (BankAccount C1 : C) {
    C1.showAccount();
}
break;
case 2:
System.out.print("Enter account no. you want to search: ");
String ac_no = sc.next();
boolean found = false;
for (BankAccount C1 : C) {
    found = C1.search(ac_no);
    if (found) {
        break;
    }
}
if (!found) {
System.out.println("Search failed! Account doesn't exist..!!");
}
break;
case 3:
System.out.print("Enter Account no. : ");
ac_no = sc.next();
found = false;
for (BankAccount C1 : C) {
    found = C1.search(ac_no);
    if (found) {
        C1.deposit();
        break;
    }
}
if (!found) {
System.out.println("Search failed! Account doesn't exist..!!");
}
break;
case 4:
System.out.print("Enter Account No : ");
ac_no = sc.next();
found = false;
for (BankAccount C1 : C) {
    found = C1.search(ac_no);
    if (found) {
        C1.withdrawal();
        break;
    }
}
if (!found) {
System.out.println("Search failed! Account doesn't exist..!!");
}
break;

case 5:
System.out.print("Enter Account No : ");
ac_no = sc.next();
found = false;
for (BankAccount C1 : C) {
    found = C1.search(ac_no);
    if (found) {
        C1.chng_adrs();
        break;
    }
}
if (!found) {
System.out.println("Search failed! Account doesn't exist..!!");
}
break;


case 6:
System.out.print("Enter Account No : ");
ac_no = sc.next();
found = false;
for (BankAccount C1 : C) {
    found = C1.search(ac_no);
    if (found) {
        C1.total_trans();
        break;
    }
}
if (!found) {
System.out.println("Search failed! Account doesn't exist..!!");
}
break;

case 7:
System.out.println("See you soon...");
break;
}

}
while(ch!=7);
}
}
    

