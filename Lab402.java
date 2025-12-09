import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String student_id = JOptionPane.showInputDialog("Enter student-id:");

        while(student_id.length() != 10){
            student_id = JOptionPane.showInputDialog("Enter student-id:");
        }
            if(student_id.substring(2,5).contains("131")){
                JOptionPane.showMessageDialog(null,
                        "Student ID: " + student_id + "\nMajor: Information Technology (IT)");
            }
            else if(student_id.substring(2,5).contains("132")){
                JOptionPane.showMessageDialog(null,
                        "Student ID: " + student_id + "\nMajor: Multimedia Technology (MT)");
            }
            else if(student_id.substring(2,5).contains("133")){
                JOptionPane.showMessageDialog(null,
                        "Student ID: " + student_id + "\nMajor: Digital Business Information Technology (BI)");
            }
            else if(student_id.substring(2,5).contains("134")){
                JOptionPane.showMessageDialog(null,
                        "Student ID: " + student_id + "\nMajor: Digital Technology in Mass Communication (DC)");
            }
            else if(student_id.substring(2,5).contains("135")){
                JOptionPane.showMessageDialog(null,
                        "Student ID: " + student_id + "\nMajor: Data Science and Data Analytics (DS)");
            }
            else {
                JOptionPane.showMessageDialog(null,
                        "Cannot found major");
            }
    }
}
