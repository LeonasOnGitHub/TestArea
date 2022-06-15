package tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPconectin {

    private boolean isServer;
    private final int PORT = 123;
    private TCPServer server;
    private Socket socket;
    private TCPClient client;

    public TCPconectin(boolean isServer){
        this.isServer = isServer;
    }

    public void run() throws IOException {

        if (this.isServer) {
            System.out.println("create a server!");
            this.server = new TCPServer();
            this.socket = server.getSocket();
        } else {
            System.out.println("create a client!");
            this.client = new TCPClient();
            this.socket = this.client.getSocket();
        }
    }

    private class TCPServer {
        private ServerSocket srvSocket = null;

        public Socket getSocket() throws IOException {
            if(this.srvSocket == null) {
                this.srvSocket = new ServerSocket(PORT);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("opened connection");
            System.out.println(sb.toString());

            Socket socket = this.srvSocket.accept();

            sb.append("connected");
            System.out.println(sb.toString());

            return socket;
        }
    }

    private class TCPClient {
        private boolean killed = false;

        Socket getSocket() throws IOException {
            try {
                while (!this.killed){
                    StringBuilder sb = new StringBuilder();
                    sb.append("try to connect localhost");
                    System.out.println(sb.toString());
                    Socket socket = new Socket("localhost", PORT);
                    return socket;
                }
            } catch (IOException ioe){
                StringBuilder sb = new StringBuilder();
                sb.append("failed to connect localhost");
                System.out.println(sb.toString());
            }
            throw new IOException("thread was killed before establishing a connection");
        }
    }
}
