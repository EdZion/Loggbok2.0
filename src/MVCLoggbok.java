import javax.swing.*;

public class MVCLoggbok {
    private javax.swing.JPanel JPanel;
    private JTextArea textArea1;
    private JTextPane textPane1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MVCLoggbok");
        frame.setContentPane(new MVCLoggbok().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton button1;
}
