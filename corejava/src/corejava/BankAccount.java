package corejava;

public class BankAccount {

   int accountnumber;
   String accountholder;
   int balance;
   static int totalaccounts;
   
   
   BankAccount(int accountnumber,String accountholder, int balance){
	   this.accountnumber=accountnumber;
	   this.accountholder=accountholder;
	   this.balance=balance;
	   totalaccounts++;
	   
   }
   
   static int gettotalAccounts(){
	   return totalaccounts;
   }
   
   
   void deposit(int money) {
	   int totalbalance=money+balance;
	   System.out.println(totalbalance);
   }
   
   
   void withdraw(int money) {
	   int remainmoney=balance-money;
	   System.out.println(remainmoney);
   }
   
   
   public static void main(String[] args) {
	
	   BankAccount B1 = new BankAccount(01, "pranitshirole", 1);
	   BankAccount B2 = new BankAccount(02, "pratiksargar", 1000);
	   BankAccount B3 = new BankAccount(03, "niketpawar",40000);
	   
	   
	   
	   B1.deposit(2000);
	   B2.withdraw(200);
	   
	   System.out.println(BankAccount.gettotalAccounts());
	   
	   
	   
	   
	   
}
   
	
	
}
