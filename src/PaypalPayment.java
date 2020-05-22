public class PaypalPayment implements PaymentStrategy {
    String emailid;
    String password;
    PaypalPayment(String emailid,String password){
        this.emailid=emailid;
        this.password=password;
    }

    public void pay(int amount){
        System.out.println("Paid " + amount+" using Paypal : " + this.emailid+ " password : "+ this.password);
    }
}
