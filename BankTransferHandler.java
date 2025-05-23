public class BankTransferHandler {
    public static boolean validateRouting(int routing) {
        return String.valueOf(routing).length() == 9; // Simple validation
    }

    public static boolean validateAccount(int account) {
        return String.valueOf(account).length() == 10; // Another check
    }
}

