package se.kibar;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bankomat {

    static int pinCode = 2019;
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Account> accounts; // = new ArrayList<>();

    public static void login(){
        int input;
        boolean correctInput = false;
        System.out.print("Vänligen ange PIN-kod:");

        while(!correctInput) {

            try {
                input = scanner.nextInt();

                if (input == pinCode) {
                    System.out.println("Korrekt!");
                    correctInput = true;
                    //show the menu
                } else {
                    System.out.println("Inkorrekt!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Endast siffror fungerar, vänligen försök igen.");
                scanner.nextLine();
            }
        }
    }

    public void addAccount(Account newAccount){
        accounts.add(newAccount);
        System.out.println("Account has been added.");
    }

    public Account getAccount(int index){

        return accounts.get(index);
    }
}
