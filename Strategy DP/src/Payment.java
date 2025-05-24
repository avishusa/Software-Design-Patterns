public class Payment {

    public Method paymentMethod;
    public long total;
    public String date;

    Payment(long total, String date){
        this.total = total;
        this.date = date;
    }

    public Method getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Method paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        if (paymentMethod != null) {
            paymentMethod.payment();
        } else {
            System.out.println("No payment method selected.");
        }
    }

}
