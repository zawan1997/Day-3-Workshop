package myapp.core;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;


public class Bank{

    private String name;
    private String account;
    private float balance;
    private List<String>transactions = new LinkedList<String>();
    private boolean status;
    private int creation;
    private int closing;
    String input;
    String amount;
    Console cons= System.console();

    public Bank(){
        System.out.println("Welcome to your bank");

    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        if(amount.length()> 0);
        for(int i=0; i< amount.length(); i++ ){
            System.out.printf("you have %d in your account" ,amount);
        }
        

    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        if(input.equals("deposit"));
        String[]amount = input.split(" ");
        this.transactions = transactions;
        input=cons.readLine("> ");
        for(int i=0; i< input.length(); i++){
            System.out.printf("%d was deposited today", transactions);
        }
                
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int getClosing() {
        return closing;
    }

    public void setClosing(int closing) {
        this.closing = closing;
    }
    public static void main(String[] args){}
    }    


