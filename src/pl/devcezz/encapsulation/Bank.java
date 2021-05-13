package pl.devcezz.encapsulation;

public class Bank {

    public static void main(String[] args) {
        Account account = new Account("EUR");
        account.add(12.34);
        account.add(89.33);
        System.out.println(account.printReport());

        Account account2 = new Account("EUR");
        account2.addWithCurrency(16, "EUR");
        account2.addWithCurrency(20, "PLN");
        System.out.println(account2.printReport());
    }
}
