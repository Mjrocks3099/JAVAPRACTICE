import java.awt.event.*;
import java.awt.*;
import javax.awt.*;
import javax.swing.*;

class solve extends JFrame implements itemListener{
    static JFrame f;
    static JLabel l,l1;
    static JComboBox c1;
    public static void main(String []args)
    {
        f = new JFrame("frame");
        solve s = new solve();
        f.setLayout(new FlowLayout());
        String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" };
 
        // create checkbox
        c1 = new JComboBox(s1);
 
        // add ItemListener
        c1.addItemListener(s);
 
        // create labels
        l = new JLabel("select your city ");
        l1 = new JLabel("Jalpaiguri selected");
 
        // set color of text
        l.setForeground(Color.red);
        l1.setForeground(Color.blue);
 
        // create a new panel
        JPanel p = new JPanel();
 
        p.add(l);
        p.add(c1);
 
        p.add(l1);
 
        // add panel to frame
        f.add(p);
 
        // set the size of frame
        f.setSize(400, 300);
 
        f.show();
    }
    public void itemStateChanged(ItemEvent e)
    {
        // if the state combobox is changed
        if (e.getSource() == c1) {
 
            l1.setText(c1.getSelectedItem() + " selected");
        }
    }


    }



    

