import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVCLoggbok {
    private JPanel Panel;
    private JButton Add;
    private JTextArea textArea1;
    private JTextField textField1;

    public MVCLoggbok() {
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    public JButton getAdd() {
        return Add;
    }

    public JPanel getPanel() {
        return Panel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MVCLoggbok");
        frame.setContentPane(new MVCLoggbok().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
