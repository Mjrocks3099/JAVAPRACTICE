import javax.swing.*;
import java.awt.event.*;

public class swap implements ActionListener{
    JTextField tf1,tf2;
    JButton b1;
    swap(){
        JFrame f= new JFrame();
        tf1=new JTextField();
        tf1.setBounds(50,50,150,20);
        tf2=new JTextField();
        tf2.setBounds(50,100,150,20);
        b1=new JButton("Ok");
        b1.setBounds(50,200,50,50);
        b1.addActionListener(this);
        f.add(tf1);f.add(tf2);f.add(b1);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
     public void actionPerformed(ActionEvent e) {
        String temp = t1.getText();
        t1.setText(t2.getText());
        t2.setText(temp);
    }
    public static void main(String[] args) {
        new swap();
    } }