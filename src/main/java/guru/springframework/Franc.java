package guru.springframework;

public class Franc {
      private int amount;
       public Franc(int amount){

           this.amount =amount;
       }
       Franc times(int multiplier){

           return new Franc(amount * multiplier);
       }
       public boolean equals(Object obj){
           if (getClass() != obj.getClass())
               return false;
              Franc franc=(Franc)obj;
              return this.amount == franc.amount;
       }
}
