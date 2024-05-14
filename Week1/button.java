import javax.swing.JButton;
import javax.swing.JFrame;

public class button {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Button Example");

        // Create a new JButton with text "Click Me"
        JButton button = new JButton("Click Me");

        // Add the button to the JFrame
        frame.add(button);

        // Set the size of the JFrame
        frame.setSize(300, 200);

        // Set the default close operation of the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the visibility of the JFrame
        frame.setVisible(true);
    }
}

