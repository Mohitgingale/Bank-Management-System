package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JButton next;
    JRadioButton r1,r2,marid,unmarid,other;
    JTextField textName,textFName,textEmail,textAdd,textC,textState,textPin;



    JDateChooser dateChooser;
    Random ran=new Random();



    long first4=(ran.nextLong() %9000L)+1000L;
    String first=" "+Math.abs(first4);


    
    Signup(){

        super("APPLICATION FORM");

            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
            Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(25,10,100,100);
            add(image);
                //label for APPLICATION FORM NO
                JLabel label1=new JLabel("APPLICATION FORM NO :"+ first); //Sow Texts on Frame
                label1.setFont(new Font("Raleway", Font.BOLD,38  ));
                label1.setBounds(160,20,600,40);
                add(label1);

                //label for PAGE NO 1
                JLabel label2=new JLabel("PAGE NO 1:"); //Sow Texts on Frame
                label2.setFont(new Font("Raleway", Font.BOLD,22  ));
                label2.setBounds(330,60,600,30);
                add(label2);

                //label for PERSONAL DETAILS
                JLabel label3=new JLabel("PERSONAL DETAILS :"); //Sow Texts on Frame
                label3.setFont(new Font("Raleway", Font.BOLD,22  ));
                label3.setBounds(290,90,600,30);
                add(label3);


                //label for NAME
                JLabel labelname=new JLabel("Name : "); //Sow Texts on Frame
                labelname.setFont(new Font("Raleway", Font.BOLD,20  ));
                labelname.setBounds(100,140,100,30);
                add(labelname);

                //Text for Name
                textName =new JTextField();
                textName.setFont(new Font("Raleway",Font.BOLD,14));
                textName.setBounds(300,140,400,30);
                add(textName);

                //label for Father NAME
                JLabel labelFname=new JLabel("Father's Name : "); //Sow Texts on Frame
                labelFname.setFont(new Font("Raleway", Font.BOLD,20  ));
                labelFname.setBounds(100,190,200,30);
                add(labelFname);

                //Text for Father Name
                textFName =new JTextField();
                textFName.setFont(new Font("Raleway",Font.BOLD,14));
                textFName.setBounds(300,190,400,30);
                add(textFName);

                //label for DOB
                JLabel DOB=new JLabel("DOB : "); //Sow Texts on Frame
                DOB.setFont(new Font("Raleway", Font.BOLD,20  ));
                DOB.setBounds(100,290,200,30);
                add(DOB);

                dateChooser =new JDateChooser();
                dateChooser.setForeground(new Color(105,105,105));
                dateChooser.setBounds(300,290,400,30);
                add(dateChooser);

                //Label for Gender
                JLabel labelG=new JLabel("Gender : "); //Sow Texts on Frame
                labelG.setFont(new Font("Raleway", Font.BOLD,20  ));
                labelG.setBounds(100,240,200,30);
                add(labelG);

                r1=new JRadioButton("Male");
                r1.setFont(new Font("Raleway", Font.BOLD,14  ));
                r1.setBackground(new Color(222,255,228));
                r1.setBounds(300,240,60,30);
                add(r1);

                r2=new JRadioButton("Female");
                r2.setFont(new Font("Raleway", Font.BOLD,14  ));
                r2.setBackground(new Color(222,255,228));
                r2.setBounds(450,240,90,30);
                add(r2);

                    ButtonGroup buttonGroup = new ButtonGroup();
                    buttonGroup.add(r1);
                    buttonGroup.add(r2);

                //LAbel for Email
                JLabel labelEmail=new JLabel("Email : "); //Sow Texts on Frame
                labelEmail.setFont(new Font("Raleway", Font.BOLD,20  ));
                labelEmail.setBounds(100,340,200,30);
                add(labelEmail);

                //Text for mAIL
                textEmail =new JTextField();
                textEmail.setFont(new Font("Raleway",Font.BOLD,14));
                textEmail.setBounds(300,340,400,30);
                add(textEmail);


                //LAbel for Marid status
                JLabel labelMS=new JLabel("Married Status : "); //Sow Texts on Frame
                labelMS.setFont(new Font("Raleway", Font.BOLD,20  ));
                labelMS.setBounds(100,390,200,30);
                add(labelMS);

                marid=new JRadioButton("Married");
                marid.setFont(new Font("Raleway", Font.BOLD,14  ));
                marid.setBackground(new Color(222,255,228));
                marid.setBounds(300,390,90,30);
                add(marid);

                unmarid=new JRadioButton("Unmarried");
                unmarid.setFont(new Font("Raleway", Font.BOLD,14  ));
                unmarid.setBackground(new Color(222,255,228));
                unmarid.setBounds(450,390,120,30);
                add(unmarid);

                other=new JRadioButton("Other");
                other.setFont(new Font("Raleway", Font.BOLD,14  ));
                other.setBackground(new Color(222,255,228));
                other.setBounds(635,390,90,30);
                add(other);


                        ButtonGroup buttonGroupMarid = new ButtonGroup();
                        buttonGroupMarid.add(marid);
                        buttonGroupMarid.add(unmarid);
                        buttonGroupMarid.add(other);


                //LAbel for Address
                JLabel labelAdd=new JLabel("Address : "); //Sow Texts on Frame
                labelAdd.setFont(new Font("Raleway", Font.BOLD,20  ));
                labelAdd.setBounds(100,440,200,30);
                add(labelAdd);

                //Text for Addr
                textAdd =new JTextField();
                textAdd.setFont(new Font("Raleway",Font.BOLD,14));
                textAdd.setBounds(300,440,400,30);
                add(textAdd);

                //LAbel for CITY
                JLabel labelC=new JLabel("CITY : "); //Sow Texts on Frame
                labelC.setFont(new Font("Raleway", Font.BOLD,20  ));
                labelC.setBounds(100,490,200,30);
                add(labelC);

                //Text for City
                textC =new JTextField();
                textC.setFont(new Font("Raleway",Font.BOLD,14));
                textC.setBounds(300,490,400,30);
                add(textC);


                //LAbel for PIN
                JLabel labelpin=new JLabel("PIN CODE : "); //Sow Texts on Frame
                labelpin.setFont(new Font("Raleway", Font.BOLD,20  ));
                labelpin.setBounds(100,540,200,30);
                add(labelpin);

                //Text for PIN
                textPin =new JTextField();
                textPin.setFont(new Font("Raleway",Font.BOLD,14));
                textPin.setBounds(300,540,400,30);
                add(textPin);




        //LAbel for STATE
        JLabel labelState=new JLabel("STATE : "); //Sow Texts on Frame
        labelState.setFont(new Font("Raleway", Font.BOLD,20  ));
        labelState.setBounds(100,590,200,30);
        add(labelState);

        //Text for PIN
        textState =new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,590,400,30);
        add(textState);


        //Button
        next=new JButton("Next >>");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        next.setBounds(620,640,80,30);
        add(next);




        //Direct Frame Attributes
                getContentPane().setBackground(new Color(222,255,228));
                setLayout(null);
                setSize(850,730);
                setLocation(200,-5);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String formno=first;
            String name=textName.getText();
            String fname=textFName.getText();
            String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender=null;
                if (r1.isSelected()){
                    gender="Male";
                }else if (r2.isSelected()){
                    gender="Female";
                }
            String email=textEmail.getText();
            String marital=null;
                if (marid.isSelected()){
                    marital="Married";
                }else if (unmarid.isSelected()){
                    marital="Unmarried";
                }else if (other.isSelected()){
                    marital="Other";
                }
        String address=textAdd.getText();
        String city=textC.getText();
        String pincode=textPin.getText();
        String state=textState.getText();



        try {
                if (textName.getText().equals("") || textFName.getText().equals("") ||textC.getText().equals("") || textEmail.getText().equals("") || textState.getText().equals("") || textPin.getText().equals("") || textAdd.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                }else {
                    Con con1=new Con();
                    String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"', '"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";

                    con1.statement.executeUpdate(q);
                    new Signup2(formno);
                    setVisible(false);

                }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
    new Signup();
    }
}
