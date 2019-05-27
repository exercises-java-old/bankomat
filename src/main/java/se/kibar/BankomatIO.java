package se.kibar;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankomatIO {
    private boolean correctInput = false;
    private Scanner scanner = new Scanner(System.in);

    //The return type is String since PIN-codes should be able to be e.g. 0000
    //The conversion to int is to check that its only numbers
    public String enterPinCode(){
        String input = "";
        correctInput = false;

        System.out.print("Vänligen ange PIN:");

        while(!correctInput) {
            try {
                input = scanner.nextLine();
                if( (input.length() != 4) ) {
                    System.out.println("PIN måste vara 4 tecken långt");
                }
                else{
                    Integer.parseInt(input);
                    correctInput = true;
                }

            } catch (NumberFormatException e) {
                System.out.println("PIN får endast innehålla siffror");
                scanner.nextLine();
            }

        }
        return input;
    }//enterPinCode

    /*
    Deprecated since it does more than one thing and also things not concerning I/O
     */
    @Deprecated
    public Account createAccount(){
       double balance = 0;
       String pinCode = "";
       correctInput = false;

        System.out.print("Vänligen ange saldo: ");

        while(!correctInput){
            try{
                balance = scanner.nextDouble();
                if( balance < 0){
                    System.out.println("Saldot kan inte understiga 0 kr.");
                }
                else correctInput = true;
            }catch (InputMismatchException e){
                System.out.println("Vänligen ange saldot med ett decimaltal.");
                scanner.nextLine();
            }
        }
        pinCode = enterPinCode();

        return new Account(balance, pinCode);
    }//createAccount

    public double enterBalance(){
        double balance = 0;
        correctInput = false;

        System.out.print("Vänligen ange saldo: ");

        while(!correctInput){
            try{
                balance = scanner.nextDouble();
                if( balance < 0){
                    System.out.println("Saldot kan inte understiga 0 kr.");
                }
                else correctInput = true;
            }catch (InputMismatchException e){
                System.out.println("Vänligen ange saldot med ett decimaltal.");
                scanner.nextLine();
            }
        }
        return balance;
    }

}//BankomatIO
