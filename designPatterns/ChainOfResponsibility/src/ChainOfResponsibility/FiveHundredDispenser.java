package ChainOfResponsibility;

public class FiveHundredDispenser extends PaperCurrencyDispenser{

    public FiveHundredDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency currency) {
        if (currency != null) {
            int Amount = currencAmount();
            int Remainder = Amount;
            if (Amount >= 500) {
                int Count = Amount / 500;
                Remainder = Amount % 500;
                System.out.printf("Dispensing '%d' 500/= currency note.\n", Count);
            }

            if (Remainder > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new PaperCurrency(Remainder));
            }
        }
    }

}
