package guru.springframework;

public class Dollar {
      private int amount;
       public Dollar(int amount){
           this.amount =amount;
       }
       Dollar times(int multiplier){
         return new Dollar(amount * multiplier);
       }
       public boolean equals(Object obj){
           if (getClass() != obj.getClass())
               return false;
              Dollar dollar=(Dollar)obj;
              return this.amount == dollar.amount;
       }
}
