package se.kibar;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bankomat {

    static int pinCode = 2019;
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Account> accounts = new ArrayList<>();

    public static boolean login(Account account, String pinCode) {
        return  account.getPinCode() == pinCode ;
    }

    public void addAccount(Account newAccount) {
        accounts.add(newAccount);
    }

    public Account getAccount(int index) throws IndexOutOfBoundsException {

        return accounts.get(index);
    }
}
