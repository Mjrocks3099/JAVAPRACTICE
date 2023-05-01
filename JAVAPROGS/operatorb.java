
import javax.swing.*;
public class operatorb {
public static void main(String[] args) {
JFrame f=new JFrame();
JLabel a = new JLabel("Arithmatic calculator");
a.setBounds(100,100, 200, 30);
f.add(a);
JLabel b = new JLabel("Enter First Number");
b.setBounds(100, 150, 250, 30);
f.add(b);
JTextField a1 = new JTextField("");
a1.setBounds(100,200,270,30);
f.add(a1);
JLabel c = new JLabel("Enter Second Number");
c.setBounds(100, 250, 290, 30);
f.add(c);
JTextField c1 = new JTextField("");
c1.setBounds(100,300,310,30);
f.add(c1);
JButton B = new JButton("+");
B.setBounds(100, 320, 40, 30);
f.add(B);
JButton d = new JButton("-");
d.setBounds(100, 340, 60, 30);
f.add(d);
JButton e = new JButton("*");
e.setBounds(100, 360, 80, 30);
f.add(e);
JButton g = new JButton("/");
g.setBounds(100, 380, 100, 30);
f.add(d);
JLabel R = new JLabel("THE RESULT");
R.setBounds(100, 400, 150, 30);
JTextField v = new JTextField("");
v.setBounds(100, 420, 170, 30);

/*JLabel b=new JLabel("Select a course");
JRadioButton b1=new JRadioButton("MCA");
JRadioButton b2=new JRadioButton("bca");
JRadioButton b3=new JRadioButton("M.Sc.it");
JTextField b5=new JTextField("");

b.setBounds(100,100,200,30);
f.add(b);
b1.setBounds(100,150,200,30);
f.add(b1);
b2.setBounds(100,200,200,30);
f.add(b2);
b3.setBounds(100,250,200,30);
f.add(b3);
b5.setBounds(100,300,95,30);
f.add(b5);*/
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
}


    

