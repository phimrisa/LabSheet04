import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input some sentence: ");
        String sentence = scanner.nextLine();

        while(!sentence.endsWith(".")){
            System.out.print("The sentence must end with full stop point: ");
            sentence = scanner.nextLine();
        }

        System.out.println();

        String[] split_sentence = sentence.split(" ");
        for(int i = 0; i <= split_sentence.length; i++){
            System.out.println(split_sentence[i]);
        }
    }
}
