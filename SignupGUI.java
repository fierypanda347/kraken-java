import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.io.*;
public class SignupGUI implements ActionListener
{
    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JButton button2;
    private static JLabel success;
    public void gg()
    {
        JPanel panel=new JPanel();
        JFrame frame=new JFrame();
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        
        userlabel=new JLabel("Enter Username");
        userlabel.setBounds(10,20,120,25);
        panel.add(userlabel);
        
        userText=new JTextField(20);
        userText.setBounds(130,20,165,25);
        panel.add(userText);
        
        passwordLabel=new JLabel("Enter Password");
        passwordLabel.setBounds(10,50,120,25);
        panel.add(passwordLabel);
        
        passwordText=new JPasswordField();
        passwordText.setBounds(130,50,165,25);
        panel.add(passwordText);
        
        button=new JButton("Sign Up and Login");
        button.setBounds(10,80,150,25);
        button.addActionListener(new SignupGUI());
        panel.add(button);
        
        success=new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String user=userText.getText();
        String password=passwordText.getText();         
        FiletxtEditor f1=new FiletxtEditor();
        String userpass=user+","+password;
        f1.op(userpass);
    }      
}  