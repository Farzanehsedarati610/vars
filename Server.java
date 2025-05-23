import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        // Get Render-assigned port (fallback to 8080 if not found)
        String port = System.getenv("PORT");
        if (port == null) port = "8080";

        int serverPort = Integer.parseInt(port);
        HttpServer server = HttpServer.create(new InetSocketAddress("0.0.0.0", serverPort), 0);

        // Transaction Handling Endpoint
        server.createContext("/transfer", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                if ("POST".equals(exchange.getRequestMethod())) {
                    String response = "Transaction received";
                    exchange.sendResponseHeaders(200, response.length());
                    OutputStream os = exchange.getResponseBody();
                    os.write(response.getBytes());
                    os.close();
                } else {
                    exchange.sendResponseHeaders(405, -1); // Method Not Allowed
                }
            }
        });

        // Start the server
        server.setExecutor(null); // Default executor
        server.start();
        System.out.println("Server running on port: " + serverPort);
    }
}

