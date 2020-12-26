import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class IntroScreen extends JFrame
{
    private static ImageIcon image1;
    private static JLabel label1;
    IntroScreen()
    {
        setLayout(new FlowLayout());
        image1=new ImageIcon(getClass().getResource("Kraken.gif"));
        label1=new JLabel(image1);
        add(label1);  
    }
    public static void main(String[]args)
    {
        IntroScreen gui=new IntroScreen();
        JPanel panel=new JPanel();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Kraken");
        try
        {
            Thread.sleep(4530);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        gui.setVisible(false);
        LoginGUI l1=new LoginGUI();
        l1.gg();
    } 
}