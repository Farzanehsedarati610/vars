import java.util.HashMap;

public class PaymentGateway {
    public static void main(String[] args) {
        HashMap<String, String> transactions = new HashMap<>();
        transactions.put("x", TransactionProcessor.processTransaction(
            "65a6745f084e7af17e1715ae9302cc14820e331af610badd3d9805cb9cd3504e", 283977688, 339715
        ));

        System.out.println("Transactions processed: " + transactions);
    }
}

