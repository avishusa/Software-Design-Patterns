    public class Transection {
        public static void main(String[] args) {
            Payment payment = new Payment(200, "2025-05-21");

            payment.setPaymentMethod(new CreditCard());
            payment.processPayment();

            payment.setPaymentMethod(new Paypal());
            payment.processPayment();

            payment.setPaymentMethod(new Cash());
            payment.processPayment();
        }
    }


