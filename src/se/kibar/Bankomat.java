package se.kibar;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bankomat implements Serializable {

    static int pinCode = 2019;
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Account> accounts = new ArrayList<>();
    private static String filePath = "C:\\Users\\zgrkbr\\git\\bankomat\\bankomat.kib";
    private static final long serialVersionID = 0L;
    public static boolean login(Account account, String pinCode) {
        return  account.getPinCode() == pinCode ;
    }

    public void addAccount(Account newAccount) {
        accounts.add(newAccount);
    }

    public Account getAccount(int index) throws IndexOutOfBoundsException {
        return accounts.get(index);
    }

    public void save(){
        File file = new File(filePath);
        try {
            file.createNewFile(); //only if the file doesn't exist
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            System.out.println("Success!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to write.");
        }
    }

    public static Bankomat load(){
        Bankomat temp = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
             temp = (Bankomat)ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Load error");
        } catch (ClassNotFoundException e){
            System.out.println("Impossible error");
        }
        return temp;
    }
}
