/*
35. TCP Client-Server Chat 
• Objective: Use Java sockets for TCP communication. 
• Task: Implement a simple TCP chat system. 
• Instructions: 
o Create a ServerSocket that listens for connections. 
o Accept client connections and use InputStream and OutputStream for two-way communication. 
o Run server and client in different terminals. 

*/

package CoreJava;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class File35tcpServerClient {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println("Received: " + inputLine);
            if (inputLine.equals("bye")) {
                break;
            }
            out.println("Echo: " + inputLine);
        }
        out.close();
        in.close();
        socket.close();
        serverSocket.close();
    }
}

