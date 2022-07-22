package ChainOfResponsibility;

public class ThousandDispenser extends PaperCurrencyDispenser{

    public ThousandDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency currency) {
        if (currency != null) {
            int Amount = currency.getAmount();
            int Remainder = Amount;
            if (Amount >= 1000) {
                int Count = Amount / 1000;
                Remainder = Amount % 1000;
                System.out.printf("Dispensing '%d' 1000/= currency note.\n", Count);
            }

            if (Remainder > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new PaperCurrency(Remainder));
            }
        }
    }

}
