package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5,comboBox6;
    JRadioButton yes1,no1,yes2,no2;
    JButton next;

    JTextField textField1,textField2;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");


            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
            Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(150,5,100,100);
            add(image);

            this.formno=formno;

            //label for PAGE NO 2
            JLabel l1=new JLabel("PAGE NO 2:"); //Sow Texts on Frame
            l1.setFont(new Font("Raleway", Font.BOLD,22  ));
            l1.setBounds(300,30,600,30);
            add(l1);

            //label for PERSONAL DETAILS
            JLabel l2=new JLabel("ADDITIONAL DETAILS :"); //Sow Texts on Frame
            l2.setFont(new Font("Raleway", Font.BOLD,22  ));
            l2.setBounds(300,60,600,40);
            add(l2);

            //label for RELIGIAN
            JLabel l3=new JLabel("Religion :"); //Sow Texts on Frame
            l3.setFont(new Font("Raleway", Font.BOLD,18  ));
            l3.setBounds(100,120,100,30);
            add(l3);

            String religion[]={"Hindu","Mahar","Cristian","Jain","Sikh","Other"};
            comboBox=new JComboBox(religion);
            comboBox.setBackground(new Color(252, 208, 76));
            comboBox.setFont(new Font("Raleway", Font.BOLD,14  ));
            comboBox.setBounds(350,120,320,30);
            add(comboBox);

            //label for Category
            JLabel l4=new JLabel("Category :"); //Sow Texts on Frame
            l4.setFont(new Font("Raleway", Font.BOLD,18  ));
            l4.setBounds(100,170,100,30);
            add(l4);

            String category[]={"General","EWS","OBC","SC","ST","VJ","NT","Other"};
            comboBox2=new JComboBox(category);
            comboBox2.setBackground(new Color(252, 208, 76));
            comboBox2.setFont(new Font("Raleway", Font.BOLD,14  ));
            comboBox2.setBounds(350,170,320,30);
            add(comboBox2);

            //label for INCOME
            JLabel l5=new JLabel("Income :"); //Sow Texts on Frame
            l5.setFont(new Font("Raleway", Font.BOLD,18  ));
            l5.setBounds(100,220,100,30);
            add(l5);

            String income[]={"Null","<1,00,000","<2,50,000","<5,00,000","UPTO 10,00,000","ABOVE 10,00,000"};
            comboBox3=new JComboBox(income);
            comboBox3.setBackground(new Color(252, 208, 76));
            comboBox3.setFont(new Font("Raleway", Font.BOLD,14  ));
            comboBox3.setBounds(350,220,320,30);
            add(comboBox3);

            //label for EDUCSation
            JLabel l6=new JLabel("Education :"); //Sow Texts on Frame
            l6.setFont(new Font("Raleway", Font.BOLD,18  ));
            l6.setBounds(100,270,150,30);
            add(l6);

            String education[]={"Non Graduate","Under Graduate","Post Graduate","PHD","Other"};
            comboBox4=new JComboBox(education);
            comboBox4.setBackground(new Color(252, 208, 76));
            comboBox4.setFont(new Font("Raleway", Font.BOLD,14  ));
            comboBox4.setBounds(350,270,320,30);
            add(comboBox4);


            //label for OCCUPATION
            JLabel l7=new JLabel("Occupation :"); //Sow Texts on Frame
            l7.setFont(new Font("Raleway", Font.BOLD,18  ));
            l7.setBounds(100,320,150,30);
            add(l7);

            String occupation[]={"Salaried","Self-Employed","Farmer","Business","Student","Retired","Other"};
            comboBox5=new JComboBox(occupation);
            comboBox5.setBackground(new Color(252, 208, 76));
            comboBox5.setFont(new Font("Raleway", Font.BOLD,14  ));
            comboBox5.setBounds(350,320,320,30);
            add(comboBox5);


            //label for PAN
            JLabel l8=new JLabel("PAN No :"); //Sow Texts on Frame
            l8.setFont(new Font("Raleway", Font.BOLD,18  ));
            l8.setBounds(100,370,150,30);
            add(l8);

            //Text for PAN
            textField1 =new JTextField();
            textField1.setFont(new Font("Raleway",Font.BOLD,14));
            textField1.setBounds(350,370,320,30);
            add(textField1);



            //label for AADHAR
            JLabel l9=new JLabel("Aadhar No :"); //Sow Texts on Frame
            l9.setFont(new Font("Raleway", Font.BOLD,18  ));
            l9.setBounds(100,420,150,30);
            add(l9);

            //Text for aadhar
            textField2 =new JTextField();
            textField2.setFont(new Font("Raleway",Font.BOLD,14));
            textField2.setBounds(350,420,320,30);
            add(textField2);

            //label for Senior
            JLabel l10=new JLabel("Senior  Citizen :"); //Sow Texts on Frame
            l10.setFont(new Font("Raleway", Font.BOLD,18  ));
            l10.setBounds(100,470,150,30);
            add(l10);

            yes1=new JRadioButton("Yes");
            yes1.setFont(new Font("Raleway", Font.BOLD,14  ));
            yes1.setBackground(new Color(252, 208, 76));
            yes1.setBounds(350,470,100,30);
            add(yes1);

            no1=new JRadioButton("No");
            no1.setFont(new Font("Raleway", Font.BOLD,14  ));
            no1.setBackground(new Color(252, 208, 76));
            no1.setBounds(500,470,100,30);
            add(no1);
                ButtonGroup senior = new ButtonGroup();
                senior.add(yes1);
                senior.add(no1);


            //label for Existing Account
            JLabel l11=new JLabel("Existing Account :"); //Sow Texts on Frame
            l11.setFont(new Font("Raleway", Font.BOLD,18  ));
            l11.setBounds(100,520,200,30);
            add(l11);

            yes2=new JRadioButton("Yes");
            yes2.setFont(new Font("Raleway", Font.BOLD,14  ));
            yes2.setBackground(new Color(252, 208, 76));
            yes2.setBounds(350,520,100,30);
            add(yes2);

            no2=new JRadioButton("No");
            no2.setFont(new Font("Raleway", Font.BOLD,14  ));
            no2.setBackground(new Color(252, 208, 76));
            no2.setBounds(500,520,100,30);
            add(no2);
                ButtonGroup exist = new ButtonGroup();
                exist.add(yes2);
                exist.add(no2);


        //label for Form No
        JLabel l12=new JLabel("Form No :"); //Sow Texts on Frame
        l12.setFont(new Font("Raleway", Font.BOLD,18  ));
        l12.setBounds(650,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formno); //Sow Texts on Frame
        l13.setFont(new Font("Raleway", Font.BOLD,18  ));
        l13.setBounds(740,10,60,30);
        add(l13);



        //Button
        next=new JButton("Next >>");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        next.setBounds(550,600,80,30);
        add(next);




        getContentPane().setBackground(new Color(252, 208, 76));
        setLayout(null);
        setSize(850,730);
        setLocation(200,-5);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel=(String) comboBox.getSelectedItem();
        String cate=(String) comboBox2.getSelectedItem();
        String inc=(String) comboBox3.getSelectedItem();
        String edu=(String) comboBox4.getSelectedItem();
        String occu=(String) comboBox5.getSelectedItem();

        String pan=textField1.getText();
        String aadhar=textField2.getText();

        String scitizen=" ";
        if((yes1.isSelected())){
            scitizen = "Yes";
        }else if((no1.isSelected())){
            scitizen ="No";
        }

        String eaccount=" ";
        if((yes2.isSelected())){
            eaccount = "Yes";
        }else if((no2.isSelected())){
            eaccount ="No";
        }


        try {
            if(textField1.getText().equals("")||textField2.getText().equals("")){
                JOptionPane.showMessageDialog(null ,"Fill all fields");
            }
            else {
                Con c1 = new Con();
                String q = "insert into signuptwo values('"+formno+"', '"+rel+"','"+cate+"', '"+inc+"','"+edu+"','"+occu+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);


            }

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }






    }

    public static void main(String[] args) {
       new Signup2("");
    }
}
