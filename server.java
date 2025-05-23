String port = System.getenv("PORT");  // Get Render's assigned port
if (port == null) port = "8080";  // Default to 8080
ServerSocket server = new ServerSocket(Integer.parseInt(port), 50, InetAddress.getByName("0.0.0.0"));

@PostMapping("/transfer")
public ResponseEntity<String> processTransfer(@RequestBody TransferRequest request) {
    String transactionHash = sha256(request.getAccount(), request.getAmount());
    return ResponseEntity.ok("Transaction processed. Hash: " + transactionHash);
}

