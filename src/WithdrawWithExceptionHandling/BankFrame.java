import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankFrame extends JFrame {
    JTextField wTextField;
    JButton wButton;
    JLabel bLabel;

    private BankAccount account;

    public BankFrame(String title){
        setTitle(title);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        account = new BankAccount(1000);

        wTextField = new JTextField(10);




        add(wTextField);
        wButton = new JButton("Withdraw");
        bLabel = new JLabel("Balance: Taka "+account.getBalance());
        setLayout(new FlowLayout());

        add(new JLabel("Enter Withdrawal amount: "));
        add(wTextField);
        add(wButton);
        add(bLabel);

        wButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdrawMethod();
            }
        });

        getContentPane().setBackground(Color.CYAN);
        setVisible(true);


    }
    public void withdrawMethod(){
        try{
            double amount = Double.parseDouble(wTextField.getText());

            account.withdraw(amount);

            bLabel.setText("Balance: "+account.getBalance());
            JOptionPane.showMessageDialog(this,"Withdrawal Successfull","Success",JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this,"Error: Please enter a valid number");
        } catch (AccountBalanceException e){
            JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        BankFrame frame = new BankFrame("Bank");
    }
}
