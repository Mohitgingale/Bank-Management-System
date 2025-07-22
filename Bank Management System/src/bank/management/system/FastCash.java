package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;
    FastCash(String pin){
this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1300,730, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1300,700);
        add(image);

        JLabel label1=new JLabel("SELECT WITHDRAWL AMOUNT");
        label1.setFont(new Font("System",Font.BOLD,20));
        label1.setForeground(new Color(255, 255, 255));
        label1.setBounds(375,140,325,35);
        image.add(label1);



        b1=new JButton("Rs. 100");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(345,224,155,28);
        image.add(b1);

        b2=new JButton("Rs. 500");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBounds(560,224,155,28);
        image.add(b2);



        b3=new JButton("Rs. 1000");
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        b3.setBounds(345,265,155,28);
        image.add(b3);

        b4=new JButton("Rs. 2000");
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        b4.setBounds(560,265,155,28);
        image.add(b4);

        b5=new JButton("Rs. 5000");
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        b5.setBounds(345,305,155,28);
        image.add(b5);

        b6=new JButton("Rs. 10000");
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        b6.setBounds(560,305,155,28);
        image.add(b6);

        b7=new JButton("BACK");
        b7.setBackground(new Color(65,125,128));
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        b7.setBounds(560,345,155,28);
        image.add(b7);



        getContentPane().setBackground(new Color(252, 208, 76));
        setLayout(null);
        setSize(1300,730);
        setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b7){
            setVisible(false);
            new main_Class(pin);

        }else{
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Con c=new Con();
            Date date=new Date();

            try {

                ResultSet resultSet=c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance =0;

                while (resultSet.next()){
                   if (resultSet.getString("type") .equals("Deposit")){

                       balance+=Integer.parseInt(resultSet.getString("amount"));
                   }else {
                       balance-=Integer.parseInt(resultSet.getString("amount"));
                   }
                }


                if(e.getSource()!=b7 && balance <Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited Successfuly");
            } catch (Exception E) {
                E.printStackTrace();
            }
            setVisible(false);
            new main_Class(pin);
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
