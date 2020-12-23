import javax.swing.JFrame;
import javax.swing.JPanel;
import enigma.console.*; 
import enigma.core.Enigma;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
public class LoginGUI implements ActionListener
{
    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    public void gg()
    {
        JPanel panel=new JPanel();
        JFrame frame=new JFrame("Login");
        frame.setSize(400,315);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        
        userlabel=new JLabel(new ImageIcon("Picture1.png"));
        userlabel.setBounds(0,0,400,250);
        panel.add(userlabel);
        
        userText=new JTextField();
        userText.setBounds(168,37,165,25);
        panel.add(userText);
        
        passwordText=new JPasswordField();
        passwordText.setBounds(168,82,165,25);
        panel.add(passwordText);
        
        button=new JButton(new ImageIcon("Login.png"));
        button.setBounds(38,120,85,37);
        button.addActionListener(new LoginGUI());
        panel.add(button);
        
        success=new JLabel(new ImageIcon("blanksuccess.png"));
        success.setBounds(11,248,380,25);
        panel.add(success);
  
        frame.setVisible(true); 
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String user=userText.getText();
        String password=passwordText.getText();
        if(user.equals("Mr. Dylan") && password.equals("DhruvHatesMath"))
        {
            success.setIcon(new ImageIcon("successop.png"));
            MainMenu mm=new MainMenu(); 
            mm.gg();
        }
        else
        {
            success.setIcon(new ImageIcon("invalid.png")); 
        }
    }
}