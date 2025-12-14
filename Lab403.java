import javax.swing.*;
import java.util.Scanner;

public class Lab403 {
    public static void main(String[] args) {
        final String USERNAME = "admin";
        final String PASSWORD = "admin1234";
        String username = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");

        while(true){
            if(!username.equalsIgnoreCase(USERNAME) || !password.equals(PASSWORD)){
                JOptionPane.showMessageDialog(null,
                        "Login Fail...",
                        "Incorrect username or password",
                        JOptionPane.WARNING_MESSAGE);

                username = JOptionPane.showInputDialog("Enter username:");
                password = JOptionPane.showInputDialog("Enter password:");
            }

            JOptionPane.showMessageDialog(null, "Login Success!!");
            break;
        }
    }
}
