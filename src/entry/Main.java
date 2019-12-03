package entry;

import entities.Account;
import entities.Client;

public class Main {

    public static void main(String[] args) {
        Client c = new Client("Enosh");
        c.addAccount(new Account(12));
        c.addAccount(new Account(13));
        c.addAccount(new Account(100));
        c.addAccount(new Account(4));
        c.addAccount(new Account(4));
        System.out.println(c);
        c.removeAccount(0);
        System.out.println(c);
        c.addAccount(new Account(4));
        System.out.println(c);
        System.out.println(c.getFortune());
    }
}
