package Project;

import java.util.Scanner;

class ATM{
    float balance;
    int PIN=2003; // by default the pin is given.

    public void checkpin(){
        System.out.println("Enter your pin");
        Scanner sc =new Scanner(System.in);
        int enterpin=sc.nextInt();
        if(PIN== enterpin){
            menu();
        }else{
            System.out.println("Enter the valid PIN");
        }
    }
    public void menu(){
        
        System.out.println("1. To check Balance");
        System.out.println("2. To withdraw Balance");
        System.out.println("3. To Deposit Balance");
        System.out.println("4. To Exit");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
          checkbalance();
        }
        else if(opt==2){
          withdraw();
        }
        else if(opt==3){
           Deposit();
        }
        else if(opt==4){
         return;
        }
        else{
            System.out.println("Enter the Valid Number");
        }
    }

    public void checkbalance(){
        System.out.println("Balance:"+balance);
        menu();
    }
   // method for withdrawing the money with conditions
    public void withdraw(){
     System.out.println("Enter the Amount To Withdraw");
     Scanner sc=new Scanner(System.in);
     float amount=sc.nextFloat();
     if(amount>balance){
         System.out.println("Insufficent Balance!!!");
     }else{
        balance=amount-balance;
        System.out.println("Money withdrawl succesfull");
     }
     menu();
    }
    // method to deposit the money with some conditions
    public void Deposit(){
        System.out.println("Enter the Amout to Deposit");
        Scanner sc= new Scanner(System.in);
        float amount=sc.nextFloat();
        balance=amount+balance;
        System.out.println("Money Deposit is done Successfully");   
        menu();
    }
    
}
public class Atmmachine {
    public static void main(String[] args) {
        System.out.println("Welcome to RBS Bank");
        System.out.println("Enter Your Choice:");
         ATM obj= new ATM();
         obj.checkpin();
    }
}
    


