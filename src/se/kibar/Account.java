package se.kibar;

import java.io.Serializable;

public class Account implements Serializable {



    private double balance;



    private String pinCode;

    Account(double balance, String pinCode){
        this.balance = balance;
        this.pinCode = pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws IllegalArgumentException{
        if(balance < 0) throw new IllegalArgumentException("Saldot får inte understiga 0 kr.");

        this.balance = balance;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString(){
        return "balance: "+balance+", PIN: "+pinCode;
    }

}
