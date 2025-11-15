package payment;

public class ApplePay implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Pay With ApplePay Payment...");

    }
}
