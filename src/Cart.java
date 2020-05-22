public class Cart {
    String item;
    int amount;
    Cart(String item, int amount){
        this.item=item;
        this.amount=amount;
    }
    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(this.amount);
    }
}
