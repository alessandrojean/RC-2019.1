import java.net.*;
import java.util.List;
import java.util.Arrays;

class UDPServerModifiedChecker {

  private static List<String> WHITE_LIST = Arrays.asList("172.17.13.228");

  public static void main(String args[]) throws Exception {
    // Create server socket
    DatagramSocket serverSocket = new DatagramSocket(9876);
    while (true) {
      byte[] receiveData = new byte[1024];
      // Block until packet is sent by client
      DatagramPacket receivedPacket = new DatagramPacket(receiveData, receiveData.length);
      serverSocket.receive(receivedPacket);
      // Get the information about the datagram of the client
      InetAddress IPAddress = receivedPacket.getAddress();
      int port = receivedPacket.getPort();
      // Allows only selected IPs.
      if (WHITE_LIST.contains(IPAddress.getHostAddress())) {
        // Get the data of the packet
        String sentence = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
        System.out.println("RECEIVED FROM CLIENT " + IPAddress.getHostAddress() + ": " + sentence);
        // Check if the phrase is a palindrome
        boolean isPalindrome = isPalindrome(sentence);
        String returnSentence = (isPalindrome) ? "SIM" : "NÃO";
        byte[] sendData = new byte[returnSentence.length()];
        sendData = returnSentence.getBytes();
        // Send back the response to the client
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
        serverSocket.send(sendPacket);
      }
    }
  }

  private static boolean isPalindrome(String sentence) {
    // Remove all the white spaces.
    sentence = sentence.replaceAll("\\s+", "").toLowerCase();

    for (int i = 0; i < sentence.length() / 2; i++) {
      if (sentence.charAt(i) != sentence.charAt(sentence.length() - i - 1))
        return false;
    }

    return true;
  }
}
