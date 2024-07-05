import javax.swing.JOptionPane;

public class ShowNames {
    
    public static void main(String[] args) {
        String name;
        name=JOptionPane.showInputDialog("Enter Your name");
        
        JOptionPane.showMessageDialog(null, "Your name is: " + name);
    }    
}
