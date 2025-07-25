package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;

    Pin(String pin){
this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1300,690, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1300,690);
        add(image);

        JLabel label1=new JLabel("CHANGE YOUR PIN ");
        label1.setFont(new Font("System",Font.BOLD,20));
        label1.setForeground(new Color(255, 255, 255));
        label1.setBounds(360,140,325,35);
        image.add(label1);

        JLabel label2=new JLabel("New PIN: ");
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setForeground(new Color(255, 255, 255));
        label2.setBounds(360,180,325,35);
        image.add(label2);

        p1=new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(510,185,170,25);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        image.add(p1);

        JLabel label3=new JLabel("Re-Enter New PIN: ");
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setForeground(new Color(255, 255, 255));
        label3.setBounds(360,220,325,35);
        image.add(label3);

        p2=new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(510,225,170,25);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        image.add(p2);





        b1=new JButton("CHANGE");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(600,300,115,30);
        image.add(b1);

        b2=new JButton("Back");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBounds(600,340,115,30);
        image.add(b2);




        setLayout(null);
        setSize(1300,730);
        setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {


        try {

            String pin1=p1.getText();
            String pin2=p2.getText();


            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Your Entered PIN Does Not Match ");
                return;
            }
            if(e.getSource()==b1){
                if(p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter New PIN ");
                    return;
                }
                if(p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN ");
                    return;
                }

                Con c=new Con();
                String q1="update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2="update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3="update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);


                JOptionPane.showMessageDialog(null,"PIN Changed Successfully ");
                setVisible(false);
                new main_Class(pin);

            } else if (e.getSource()==b2) {
                new main_Class(pin);
                setVisible(false);
                
            }

        } catch (Exception E) {
            E.printStackTrace();

        }

    }

    public static void main(String[] args) {
        new Pin("");
    }
}
