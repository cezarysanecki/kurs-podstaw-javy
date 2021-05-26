package pl.devcezz.enums;

public class Account {

    private final Currency currency;
    private double amount = 0.0;

    public Account(Currency currency) {
        this.currency = currency;
    }

    public void add(double amount, Currency currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }

        double exchangeRate = this.currency.calculateExchangeRate(currency);
        this.amount += amount * exchangeRate;
    }

    public String print() {
        return String.format("%.2f %s", amount, currency.name());
    }

    public static void main(String... args) {
        Currency currency = Currency.PLN;
        System.out.println(currency);

        Account account = new Account(Currency.EUR);
        account.add(1000, Currency.THB);
//        account.add(-10, Currency.PLN);

        System.out.println(account.print());

        printCurrency();
        printCurrency(Currency.USD);
        printCurrency(Currency.USD, Currency.PLN, Currency.EUR);

        for (String arg : args) {
            System.out.println(arg);
        }

        System.out.println("==========");

        Account argAccount = new Account(Currency.findCurrencyByString(args[0]));
        argAccount.add(Double.parseDouble(args[1]), Currency.THB);

        System.out.println(argAccount.print());

        printAccounts("==========", account, argAccount);
    }

    public static void printAccounts(String message, Account... accounts) {
        System.out.println(message);
        for (Account account : accounts) {
            System.out.println(account.print());
        }
    }

    public static void printCurrency(Currency... currencies) {
        System.out.println(currencies.length);
        for (Currency currency : currencies) {
            System.out.println(currency.name());
        }
    }
}
