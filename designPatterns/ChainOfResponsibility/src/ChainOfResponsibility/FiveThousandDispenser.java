package ChainOfResponsibility;

public class FiveThousandDispenser extends PaperCurrencyDispenser{

    public FiveThousandDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency curr) {
        if (curr != null) {
            int Amount = curr.getAmount();
            int Remainder = Amount;
            if (Amount >= 5000) {
                int Count = Amount / 5000;
                Remainder = Amount % 5000;
                System.out.printf("Dispensing '%d' 5000/= currency note.\n", Count);
            }

            if (Remainder > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new PaperCurrency(Remainder));
            }
        }
    }

}
