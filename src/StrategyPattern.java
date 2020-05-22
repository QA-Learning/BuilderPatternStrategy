public class StrategyPattern {
    public static void main(String[] args) {
        Cart cart = new Cart("Pen", 10);
        cart.pay(new PaypalPayment("myemail@example.com", "mypwd"));
        //pay by credit card
        cart.pay(new CreditCardPayment
                ("Surender", 1234567896, 786));
    }
}
