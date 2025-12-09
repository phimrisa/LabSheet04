public class Ex401 {
    public static void main(String[] args) {
        String message = "INT 108 Object-Oriented Progamming 2025";

        System.out.println("Length message = " + message.length());//Show the length of the messeage.
        System.out.println("Uppercase = " + message.toUpperCase());//Converted every character to uppercase.
        System.out.println("Lowercase = " + message.toLowerCase());//Converted every character to lowercase.
        //Use .isUpperCase() and .isLowerCase to check the case.
        System.out.println("First Letter = " + message.charAt(0));//Show the first letter from the message.
        System.out.println("Last Letter = " + message.charAt(message.length()-1));//Show the last letter from the message.
    }
}
