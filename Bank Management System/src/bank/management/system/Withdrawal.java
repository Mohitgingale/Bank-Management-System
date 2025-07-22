package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton b1,b2;
    Withdrawal(String pin){
        this.pin=pin;


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1300,690, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1300,690);
        add(image);

        JLabel label1=new JLabel("MAXIMUM WITHDRAWAL RS.10,000 ");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setForeground(new Color(255, 255, 255));
        label1.setBounds(360,140,325,35);
        image.add(label1);

        JLabel label2=new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setForeground(new Color(255, 255, 255));
        label2.setBounds(360,180,325,35);
        image.add(label2);

        textField =new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(360,220,325,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        image.add(textField);


        b1=new JButton("WITHDRAW");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(600,300,115,30);
        image.add(b1);


        b2=new JButton("BACK");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBounds(600,340,115,30);
        image.add(b2);









        getContentPane().setBackground(new Color(252, 208, 76));
        setLayout(null);
        setSize(1300,730);
        setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {


            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter Amount You Wan't to Withdraw");

                } else {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));

                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance ");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdrawl','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs." + amount + " Debited Successfully");
                    //10: 17.00

                    setVisible(false);
                    new main_Class(pin);


                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource()==b2) {
            new main_Class(pin);
            
        }
    }


    public static void main(String[] args) {
        new Withdrawal("");

    }
}
