package ChainOfResponsibility;

public class PaperCurrency {

    protected int Amount;

    public PaperCurrency(int Amount) {
        super();
        this.Amount = Amount;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

}
