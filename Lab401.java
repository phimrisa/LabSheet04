import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        String fullname = JOptionPane.showInputDialog("Enter your fullname:");

        int index = fullname.indexOf(" ");

        while (fullname.trim().indexOf(" ") == -1) {
            fullname = JOptionPane.showInputDialog("Enter your fullname:");
        }

        JOptionPane.showMessageDialog(null, "Welcome, " + 
                fullname.toUpperCase().charAt(0) + fullname.substring(1, index) + " " + 
                fullname.toUpperCase().substring(index + 1, fullname.length() - 1));
    }
}
