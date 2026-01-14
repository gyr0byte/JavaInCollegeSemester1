abstract class PaymentMethod {
    abstract void processPayment();

    abstract void verifyBalance();
}

class Esewa extends PaymentMethod {
    @Override
    void processPayment() {
        System.out.println("Esewa payment process...");
    }

    @Override
    void verifyBalance() {
        System.out.println("Esewa payment process...");
    }
}

class Khalti extends PaymentMethod {
    @Override
    void processPayment() {
        System.out.println("Khalti payment process...");
    }

    @Override
    void verifyBalance() {
        System.out.println("Khalti payment process..");
    }
}

class paypal extends PaymentMethod {
    @Override
    void processPayment() {
        System.out.println("Paypal payment process...");
    }

    @Override
    void verifyBalance() {
        System.out.println("Paypal payment process...");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {

    }
}