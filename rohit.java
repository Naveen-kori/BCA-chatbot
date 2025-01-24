import java.util.HashMap;
import java.util.Scanner;

public class rohit{

    public static void main(String[] args) {
        // Predefined responses
        HashMap<String, String> responses = new HashMap<>();
        responses.put("hello", "Hi there! How can I assist you?");
        responses.put("how are you", "I'm just a program, but I'm doing fine! How about you?");
        responses.put("what is your name", "I am your friendly department chatbot!");
        responses.put("help", "I can answer questions about courses, staff, or events. Just ask!");
        responses.put("bye", "Goodbye! Have a great day!");
        
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! I am your department assistant. Type 'help' to know what I can do.");
        
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();
            
            // Check for predefined responses
            if (responses.containsKey(userInput)) {
                System.out.println("Chatbot: " + responses.get(userInput));
                if (userInput.equals("bye")) {
                    break; // Exit on "bye"
                }
            } else {
                System.out.println("Chatbot: I'm sorry, I don't understand that. Can you try asking something else?");
            }
        }
        
        scanner.close();
    }
}
