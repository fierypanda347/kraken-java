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
    public void gg()
    {
        JPanel panel=new JPanel();
        JFrame frame=new JFrame("Main Menu");
        frame.setSize(450,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        
        userlabel=new JLabel("MAIN MENU");
        userlabel.setBounds(170,20,80,25);
        panel.add(userlabel);
        
        button=new JButton("Class Planning");
        button.setBounds(30,80,160,25);
        button.addActionListener(new MainMenu());
        panel.add(button);
        
        button2=new JButton("Student Reports");
        button2.setBounds(200,80,160,25);
        button2.addActionListener(new MainMenu());
        panel.add(button2);
        
        button3=new JButton("Class Reports");
        button3.setBounds(30,120,160,25);
        button3.addActionListener(new MainMenu());
        panel.add(button3);
        
        button4=new JButton("Generate Reports");
        button4.setBounds(200,120,160,25);
        button4.addActionListener(new MainMenu());
        panel.add(button4);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            //CSVReader c=new CSVReader();
            //c.nice();
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