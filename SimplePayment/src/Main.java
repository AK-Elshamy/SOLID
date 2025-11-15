import payment.*;
import service.*;

public class Main {
    public static void main(String[] args) {

        PaymentService visaPayment = new PaymentService(new Visa());
        visaPayment.payment();

        System.out.println("--------------------");

        PaymentService masterPayment = new PaymentService(new MasterCard());
        masterPayment.payment();

        System.out.println("--------------------");

        PaymentService applePayment = new PaymentService(new ApplePay());
        applePayment.payment();
    }
}
