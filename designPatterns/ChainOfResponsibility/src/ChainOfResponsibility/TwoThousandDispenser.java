package ChainOfResponsibility;

public class TwoThousandDispenser extends PaperCurrencyDispenser{

    public TwoThousandDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency currency) {
        if (currency != null) {
            int Amount = currency.getAmount();
            int Remainder = Amount;
            if (Amount >= 2000) {
                int Count = Amount / 2000;
                Remainder = Amount % 2000;
                System.out.printf("Dispensing '%d' 2000/= currency note.\n", Count);
            }

            if (Remainder > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new PaperCurrency(Remainder));
            }
        }
    }

}
