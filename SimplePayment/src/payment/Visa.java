package payment;

public class Visa implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("Pay With Visa Payment...");
    }
}
