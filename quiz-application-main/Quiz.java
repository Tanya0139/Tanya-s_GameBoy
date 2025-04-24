package quizapplication;

import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame{
    
    Quiz(){
        setBounds(0, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/qh.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);
        
        JLabel qno=new JLabel("1");
        qno.setBounds(100, 450, 50, 30);
        qno. setFont (new Font ("Tahoma", Font. PLAIN, 24));
        add(qno);
        
        JLabel question=new JLabel("This is a question");
        question.setBounds(150, 450, 900, 30);
        question. setFont (new Font ("Tahoma", Font. PLAIN, 24));
        add(question);
        
        
        setVisible(true);
    }
    
    
    public static void main(String[] args){
        new Quiz();
    }
    
}
