public class CreditCardPayment implements PaymentStrategy {
    String name;
    int cardNumber;
    int cvv;
    CreditCardPayment(String name,int cardNumber,int cvv){
        this.name=name;
        this.cardNumber=cardNumber;
        this.cvv=cvv;
    }

    public void pay(int amount){
    System.out.println("Paid " + amount+" using Credit card : " + this.name+ " card number : "+ this.cardNumber+" cvv:"+this.cvv);
    }
}
