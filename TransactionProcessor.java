public class TransactionProcessor {
    public static String processTransaction(String hash, int routing, int account) {
        return String.format("Hash: %s, Routing: %d, Account: %d", hash, routing, account);
    }
}

