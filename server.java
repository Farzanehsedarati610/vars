String port = System.getenv("PORT");  // Get Render's assigned port
if (port == null) port = "8080";  // Default to 8080
ServerSocket server = new ServerSocket(Integer.parseInt(port), 50, InetAddress.getByName("0.0.0.0"));



public class Server {
    public static void main(String[] args) {
        String port = System.getenv("PORT");  // Get Render's assigned port
        if (port == null) port = "8080";  // Default to 8080

        System.out.println("Server running on port: " + port);
    }
}

