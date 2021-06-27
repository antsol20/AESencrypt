import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm {

    private JPanel mainPanel;
    private JButton encryptButton;
    private JTextField encTextField;
    private JTextField plainTextField;


    public mainForm() {
        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String plainText = plainTextField.getText();
                try {
                    encTextField.setText(AES.encrypt(plainText));
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
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
