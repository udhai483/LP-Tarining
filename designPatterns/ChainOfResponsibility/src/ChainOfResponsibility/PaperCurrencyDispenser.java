package ChainOfResponsibility;

public abstract class PaperCurrencyDispenser {

    protected PaperCurrencyDispenser nextDisp;

    public void setNextDispenser(PaperCurrencyDispenser nextDisp) {
        this.nextDisp = nextDisp;
    }

    public abstract void dispense(PaperCurrency currency);

}
