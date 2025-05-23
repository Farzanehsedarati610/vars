import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String port = System.getenv("PORT");  // Get Render-assigned port
        if (port == null) port = "8080";  // Default to 8080
        ServerSocket server = new ServerSocket(Integer.parseInt(port));
        System.out.println("Server running on port " + port);
        while (true) {
            Socket client = server.accept();
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            out.println("Hello from Java Server!");
            client.close();
        }
    }
}

public class Server {
    public static void main(String[] args) {
        String port = System.getenv("PORT");
        if (port == null) port = "8080";

        System.out.println("Server running on port: " + port);

        // Example transaction endpoint using lightweight HTTP handling
        HttpServer server = HttpServer.create(new InetSocketAddress(Integer.parseInt(port)), 0);
        server.createContext("/transfer", exchange -> {
            String response = "Transaction received";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });
        server.start();
    }
}

