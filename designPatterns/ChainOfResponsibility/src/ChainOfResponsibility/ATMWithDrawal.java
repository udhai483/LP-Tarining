package ChainOfResponsibility;

public class ATMWithDrawal {
    protected static PaperCurrencyDispenser _5000_Dispenser = new FiveThousandDispenser();
    protected static PaperCurrencyDispenser _2000_Dispenser = new TwoThousandDispenser();
    protected static PaperCurrencyDispenser _1000_Dispenser = new ThousandDispenser();
    protected static PaperCurrencyDispenser _500_Dispenser = new FiveHundredDispenser();
    protected static PaperCurrencyDispenser despense_chain;
    static {
        // construct the chain of the currency dispensers in higher to lower
        // denomination
        _5000_Dispenser.setNextDispenser(_2000_Dispenser);
        _2000_Dispenser.setNextDispenser(_1000_Dispenser);
        thousandDispenser.setNextDispenser(_500_Dispenser);
        despense_chain = _5000_Dispenser;
    }

    public static void withdraw(PaperCurrency curr) {
        if (curr != null) {
            despense_chain.dispense(curr);
        }
    }
}
