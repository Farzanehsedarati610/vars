@RestController
@RequestMapping("/api")
public class TransactionController {
    @PostMapping("/transfer")
    public ResponseEntity<String> processTransfer(@RequestBody TransferRequest request) {
        String transactionHash = sha256(request.getAccount(), request.getAmount());
        return ResponseEntity.ok("Transaction processed. Hash: " + transactionHash);
    }
}

