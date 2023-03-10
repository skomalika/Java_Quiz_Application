import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class score extends JFrame implements ActionListener{
	
	JLabel heading , scores;
	JButton submit;

	public score(String name , int score) {
		
		getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        setBounds(400,150,750,550);	
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new  ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        heading = new JLabel("Thankyou " + name + " for playing Simple Minds ");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(heading);
        
        scores = new JLabel("Your score is " +score);
        scores.setBounds(350,200,300,30);
        scores.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(scores);
        
        submit = new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);

	}
	
	public void actionPerformed(ActionEvent ae){
		setVisible(false);
		new Login();
		
	}
	
	public static void main(String[] args) {
		
		new score("user",0);

	}

}
