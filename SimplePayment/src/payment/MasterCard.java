package payment;

public class MasterCard implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Pay With MasterCard Payment...");

    }
}
