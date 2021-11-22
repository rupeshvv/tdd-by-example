package guru.springframework;

public abstract class Money {
    protected int amount;
    protected String currency;

    public abstract Money times(int multiplier);

    public Money(int amount,String currency){

        this.amount =amount;
        this.currency=currency;
    }

    public String currency() {
        return currency;
    }

    public static Money dollar(int amount){
        return new Dollar(amount,"USD");
    }

    public static Money franc(int amount){
        return new Franc(amount,"CHF");
    }

    public boolean equals(Object obj){
        if (getClass() != obj.getClass())
            return false;
        Money money=(Money) obj;
        return this.amount == money.amount;
    }


}
