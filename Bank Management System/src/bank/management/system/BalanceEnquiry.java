package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;
    JButton b1;
    JLabel label2;
        BalanceEnquiry(String pin){
this.pin=pin;
            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
            Image i2= i1.getImage().getScaledInstance(1300,690, Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(0,0,1300,690);
            add(image);

            JLabel label1=new JLabel("YOUR CURRENT BALANCE IS RS. ");
            label1.setFont(new Font("System",Font.BOLD,16));
            label1.setForeground(new Color(255, 255, 255));
            label1.setBounds(360,140,325,35);
            image.add(label1);

            label2=new JLabel();
            label2.setFont(new Font("System",Font.BOLD,16));
            label2.setForeground(new Color(255, 255, 255));
            label2.setBounds(360,180,325,35);
            image.add(label2);


            b1=new JButton("BACK");
            b1.setBackground(new Color(65,125,128));
            b1.setForeground(Color.WHITE);
            b1.addActionListener(this);
            b1.setBounds(600,300,115,30);
            image.add(b1);


            int balance=0;
            try{
                Con c=new Con();
                ResultSet resultSet=c.statement.executeQuery("select * from bank where pin = '"+pin+"'");

                while (resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(resultSet.getString("amount"));

                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }





            label2.setText(""+balance);



            setLayout(null);
            setSize(1300,730);
            setLocation(0,0);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new main_Class(pin);

    }

    public static void main(String[] args) {
       new BalanceEnquiry("");

    }
}
