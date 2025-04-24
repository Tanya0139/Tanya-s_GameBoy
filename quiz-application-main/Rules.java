package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start, back;
    
    Rules(String name){
        
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Welcome "+ name + " to simple minds");
        heading.setBounds(20, 20, 700, 30);
        heading.setFont(new Font("Times New Roman", Font.BOLD,25));
        heading.setForeground(new Color(255, 184, 222));
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(15, 25, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,16));
        rules.setText(
                
                "<html>"+ 
                "1. Answer point to point" + "<br><br>" +
                "2. Do not copy" + "<br><br>" +
                "3. All the questions are compulsory" + "<br><br>" +
                "4. Maintain silence." + "<br><br>" +
                "5. Good luck. This quiz is only to test your knowledge, hence do not not stress over the results and try to do better next time." + "<br><br>" +
            "<html>"

              
        );
        add(rules);
        
        back= new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(255, 184, 222));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);
        
        start= new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(255, 184, 222));
        start.setForeground(Color.BLACK);
        start.addActionListener(this);
        add(start);
        
        
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            
        }else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        
        new Rules("User");
    }
}
 