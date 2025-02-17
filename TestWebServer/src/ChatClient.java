import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

    public static void main(String[] args) {
        try(Socket socket = new Socket(Constants.SERVER_ADDRESS,Constants.PORT);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to chat server");

            //Thread for receiving messages
            new Thread(()->{
                String message;
                try {
                    while ((message = in.readLine()) != null){
                        System.out.println("Received: " + message);
                    }
                } catch (IOException e) {
                    System.out.println("Connection error: " + e.getMessage());
                }
            }).start();

            //Main thread for sending messages
            String userInput;
            while ((userInput = console.readLine()) != null){
                out.println(userInput);
            }

        }catch (IOException e){
            System.out.println("Client error: " + e.getMessage());
        }
    }

}













