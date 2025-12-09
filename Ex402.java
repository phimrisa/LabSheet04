import java.util.Scanner;

public class Ex402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first message: ");
        String message1 = scanner.nextLine();
        System.out.print("Enter the second message: ");
        String message2 = scanner.nextLine();

        //Case-sensitive
        System.out.print("Sensitive Comparison = ");
        if(message1.equals(message2)){
            System.out.println("Both messages are the same.");
        }
        else{
            System.out.println("Both messages are NOT the same.");
        }

        //Case-insensitive
        if(message1.equalsIgnoreCase(message2)){
            System.out.println("Both messages are the same.");
        }
        else{
            System.out.println("Both messages are NOT the same.");
        }
    }
}
