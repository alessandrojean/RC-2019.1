import java.io.*;
import java.net.*;

class TCPServer {
  public static void main(String args[]) throws Exception {
    // Throws Exception here because don't want to deal
    // with errors in the rest of the code for simplicity.
    // (Note: NOT a good practice).

    // Welcome socket ---- SOCKET 1
    ServerSocket serverSocket = new ServerSocket(9000);
    // Waits for a new connection. Accepts connection from multiple clients
    while (true) {
      System.out.println("Waiting for connection at port 9000.");
      // Connection socket --- SOCKET 2
      Socket s = serverSocket.accept();
      System.out.println("Connection established from " + s.getInetAddress());
      // Create a BufferedReader object to read strings from
      // the socket. (read strings FROM CLIENT)
      BufferedReader br = new BufferedReader(
          new InputStreamReader(s.getInputStream()));
      String input = br.readLine();
      // Create output stream to write to/send TO CLIENT
      DataOutputStream output = new DataOutputStream(s.getOutputStream());
      // Keep repeating until an empty line is read.
      while (input.compareTo("") != 0) {
        // Convert input to upper case and echo back to client.
        output.writeBytes(input.toUpperCase() + "\n");
        input = br.readLine();
      }
      // Close current connection
      s.close();
    }
  }
}

