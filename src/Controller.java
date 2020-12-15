import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private MVCLoggbok view;
    private Loggbok model;
    public static void main(String[] args) {
        Controller program = new Controller();
    }


    public Controller() {
        view = new MVCLoggbok();
        JFrame frame = new JFrame("MVCLoggbok");
        frame.setContentPane(view.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        view.getAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }
}

