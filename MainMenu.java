import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class MainMenu implements ActionListener
{
    private static JLabel userlabel;
    private static JButton button;
    private static JButton button2;
    private static JButton button3;
    private static JButton button4;
    public void gg(int i)
    {
        JPanel panel=new JPanel();
        JFrame frame=new JFrame("Main Menu");
        frame.setSize(450,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        
        userlabel=new JLabel(new ImageIcon("menu.png"));
        userlabel.setBounds(0,0,445,265);
        panel.add(userlabel);
        
        button=new JButton(new ImageIcon("cp.png"));
        button.setBounds(55,80,160,25);
        button.addActionListener(new MainMenu());
        panel.add(button);
        
        button2=new JButton(new ImageIcon("sr.png"));
        button2.setBounds(225,80,160,25);
        button2.addActionListener(new MainMenu());
        panel.add(button2);
        
        button3=new JButton(new ImageIcon("cr.png"));
        button3.setBounds(55,128,160,25);
        button3.addActionListener(new MainMenu());
        panel.add(button3);
        
        button4=new JButton(new ImageIcon("gr.png"));
        button4.setBounds(225,128,160,25);
        button4.addActionListener(new MainMenu());
        panel.add(button4);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
        }
        else if(e.getSource()==button2)
        {
        }
        else if(e.getSource()==button3)
        {
        }
        else if(e.getSource()==button4)
        { 
        }
    }
}