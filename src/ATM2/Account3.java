package ATM2;
	 import java.util.Date;
     import java.util.Scanner;

	public class Account3 {
		
		// class variable
		int balance;
		int prevTransaction;
		String customerName;
		String customerID;
		
		// class constructor
		  public  Account3(String cname,String cid) {
			  customerID= cid;
			  customerName=cname;
		}
		  void deposit(int amount ) {
			  if (amount !=0 && amount>0) {
				  balance=balance+amount;
				  prevTransaction=amount;
			  }
		 
			  
		  }
			 void withdraw(int amount) {
				 if(amount !=0 ) {
				    balance=balance - amount;
				    prevTransaction=- amount;
					 
				 }
			 }
			 void getprevTransaction() {
				 if( prevTransaction > 0) {
					 
					 System.out.println( "Deposited :" +prevTransaction);
				 }else if( prevTransaction <0) {
					 System.out.println( " Withdraw :"+ Math.abs(prevTransaction));
				 }else {
					 System.out.println("No Transaction Occured!");
					  
				 }
			 }
			 
	         void showMenu() {
	        	 char option='\0';
	        	 Scanner scanner = new Scanner(System.in);
	        	 System.out.println("Welcome, "+ customerName + "!");
	        	 System.out.println("your ID is:" +customerID);
	        	 System.out.println();
	        	 System.out.println("What would you like to do ?"  );
	        	 System.out.println();
	        	 System.out.println("A. Check Your Balance ");
	        	 System.out.println("B. Make a deposit ");
	        	 System.out.println("C. Make a withdraw ");
	        	 System.out.println("D.view pervTransaction");
	        	 System.out.println("F.show date");
	        	 System.out.println();
	        	 
	        	 do {
	        		 System.out.println();
	        		 System.out.println("Please Enter an option: ");
	        		 char option1=scanner.next().charAt(0);
	        		 option= Character.toUpperCase(option1);
	        		 System.out.println();
	        		 
	        		 switch(option) {
	        		 case 'A':
	        			 System.out.println( "==========");
	        			 System.out.println(" Balance= $ "+ balance );
	        			 System.out.println( "==========");
	        			 break;
	        			 
	        		 case 'B':
	        			 System.out.println("Enter an amount to deposit :" );
	        			 int amount1=scanner.nextInt();
	        			 deposit(amount1);
	        			 break;
	        			  
	        		  case 'C':
	        		    System.out.println( "Enter an amount to withdraaw: ");
	        		    int amount2= scanner.nextInt();
	        		    withdraw(amount2);
	      
	        		  break;
	        		  
	        		  case 'D':
	        			System.out.println("==========");
	        			getprevTransaction();
	        			System.out.println("==========");
	      
	        			break;
	        			case 'E':
	        			System.out.println("==========");
	        			break;
	        			
	        			case 'F':
	        				Date date1=new Date();
	        				System.out.println( date1);
	        				break;
	 
	        			 default:
	        			 System.out.println( " Error: Invalid option. Please Enter A,B,C,or D");
	        			  break;
	        		 
	        	 }
	        	 }
	        	 while( option!= 'E');
	        	 System.out.println(" Thank You For Using Our ATM! ");
	  	 
	        	 
	         }
	
	        	 
	}

