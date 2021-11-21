package guru.springframework;

public abstract class Money {
    protected int amount;

    public abstract Money times(int multiplier);

    public static Money dollar(int amount){
        return new Dollar(amount);
    }

    public static Money franc(int amount){
        return new Franc(amount);
    }



    public boolean equals(Object obj){
        if (getClass() != obj.getClass())
            return false;
        Money money=(Money) obj;
        return this.amount == money.amount;
    }
}
