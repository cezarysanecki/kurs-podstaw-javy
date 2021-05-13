package pl.devcezz.encapsulation;

public class Account {

    private double balance;
    private final String currency;

    public Account(String currency) {
        this.currency = currency;
    }

    public void add(double amount) {
        this.balance += amount;
    }

    public void addWithCurrency(double amount, String currency) {
        switch (this.currency) {
            case "PLN":
                if (currency.equals("PLN")) {
                    add(amount);
                } else if (currency.equals("EUR")) {
                    add(amount * 4);
                } else {
                    System.out.println("Unknown currency");
                }
                break;
            case "EUR":
                if (currency.equals("PLN")) {
                    add(amount / 4);
                } else if (currency.equals("EUR")) {
                    add(amount);
                } else {
                    System.out.println("Unknown currency");
                }
        }
    }

    public String printReport() {
        return String.format("%.2f %s", balance, currency);
    }
}
