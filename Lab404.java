import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "";
        String stop = "stop";

        while(!word.equalsIgnoreCase(stop)){
            System.out.print("Enter word:");
            word = scanner.nextLine();
        }
    }
}
