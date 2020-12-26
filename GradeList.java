import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class GradeList implements ActionListener
{
    private static JLabel userlabel;
    private static JButton button;
    private static JButton button2;
    private static JButton button3;
    public void gg()
    {
        JPanel panel=new JPanel();
        JFrame frame=new JFrame("Grade List");
        frame.setSize(450,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        
        /*userlabel=new JLabel(new ImageIcon("menu.png"));
        userlabel.setBounds(0,0,445,265);
        panel.add(userlabel);*/
        
        button=new JButton("Class 8A");
        button.setBounds(55,80,160,25);
        button.addActionListener(new MainMenu());
        panel.add(button);
        
        button2=new JButton("Class 9A");
        button2.setBounds(225,80,160,25);
        button2.addActionListener(new MainMenu());
        panel.add(button2);
        
        button3=new JButton("Class 10A");
        button3.setBounds(140,128,160,25);
        button3.addActionListener(new MainMenu());
        panel.add(button3);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int i;
        if(e.getSource()==button)
        {
            i=1;
            MainMenu mm=new MainMenu();
            mm.gg(i);
        }
        else if(e.getSource()==button2)
        {
            i=2;
            MainMenu mm2=new MainMenu();
            mm2.gg(i);
        }
        else if(e.getSource()==button3)
        {
            i=3;
            MainMenu mm3=new MainMenu();
            mm3.gg(i);
        }
    }
}