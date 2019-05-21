package se.kibar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bankomat.login();
        Bankomat bankomat = new Bankomat();
        Account acc1 = new Account(10000.0, 2019);

        //bankomat.addAccount(acc1);

        try {
            bankomat.getAccount(1);
        }
        catch (IndexOutOfBoundsException ioobe){
            System.out.println("Ursäkta, du har angett ett index utanför vår konto-lista.");
        }
        catch (NullPointerException npe){
            System.out.println("Ursäkta, vi har inte någon lista över konton.");
        }
    }
}
