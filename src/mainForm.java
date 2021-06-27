import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm {

    private JPanel mainPanel;
    private JButton encryptButton;
    private JTextField plainTextField;
    private JTextField encTextField;


    public mainForm() {
        encryptButton.addActionListener(e -> {
            String plainText = plainTextField.getText();
            try {
                encTextField.setText(AES.encrypt(plainText));
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("AES Encryptor");
        frame.setContentPane(new mainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
