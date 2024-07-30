public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PaypalAdapter(new Paypal());
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        PaymentProcessor squareProcessor = new SquareAdapter(new Square());

        paypalProcessor.processPayment(100.00);
        stripeProcessor.processPayment(200.00);
        squareProcessor.processPayment(300.00);
    }
}
