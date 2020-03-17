
package bankaccount;

import java.util.ArrayList;


public class BankAccount {
    private static int accountsOppened;
    private int number;
    private double amount;
    private String name;
    private boolean active;
    ArrayList <String> transactions = new ArrayList();
    
    
    public BankAccount(){
        accountsOppened++;
        transactions.add("Create");
        this.active = true;
    }
    
    public BankAccount(String name, int number){
        accountsOppened++;
        transactions.add("Create");
        this.active = true;
        this.name =name;
        this.number=number;
    }
    
    public BankAccount(String name, int number, double amount, boolean active){
        accountsOppened++;
        transactions.add("Create");
        this.active = active;
        this.amount = amount;
        this.name =name;
        this.number=number;
    }
    
    
    
    public void setNumber(int number){
        this.number=number;
    }
    
    public int getNumber(){
        return number;
    }
    
//    public void setAmount(double amount){
//        this.amount=amount;
//    }
    
    public double getAmount(){
        return amount;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setActive(boolean active){
        this.active=active;
    }
    
    public boolean getActive(){
        return active;
    }
    
    public void setTransactions(ArrayList <String> transactions){
        this.transactions=transactions;
    }
    
    public ArrayList <String> getTransactions(){
        return transactions;
    }
    
    public void deposit(int moneyIn){
        this.amount+=moneyIn;
        transactions.add("Deposit");
        System.out.println("Your transaction completed. Your new amount is " + amount);
    }
    
    public void withdraw(int moneyOut){
        if(moneyOut<=amount){
            this.amount-=moneyOut;
            transactions.add("Withdraw");
            System.out.println("Your transaction completed. Your new amount is " + amount);
        }else if(moneyOut>amount){
            System.out.println("Your amount is not enough for this transaction. Your amount is " + amount);
        }else{
            System.out.println("Wrong Number");
        }
    }
}
