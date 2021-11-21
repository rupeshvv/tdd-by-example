package guru.springframework;

public class Money {
    protected int amount;

    public boolean equals(Object obj){
        if (getClass() != obj.getClass())
            return false;
        Money money=(Money) obj;
        return this.amount == money.amount;
    }
}
