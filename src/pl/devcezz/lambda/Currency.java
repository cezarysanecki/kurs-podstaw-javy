package pl.devcezz.lambda;

public enum Currency {

    EUR(4.5467),
    USD(3.8427),
    CHF(4.1965),
    GBP(5.2942),
    JPY(3.4902);

    private final double exchangeRateToPln;

    Currency(double exchangeRateToPln) {
        this.exchangeRateToPln = exchangeRateToPln;
    }

    public double getExchangeRateToPln() {
        return exchangeRateToPln;
    }
}
