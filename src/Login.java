import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logins.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(50,0,600,500);
        add(image);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        
        setSize(1200,500);
        setVisible(true);
        setLocation(200,150);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()== back){
            setVisible(false);
        }
        
    }
    
    public static void main(String args[]){
        
       new Login();
    }
}
