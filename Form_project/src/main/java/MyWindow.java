
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


class MyWindow extends JFrame
        
{
    private JLabel heading;
   
    Font font=new Font(" ", Font.BOLD, 30);
    
    private JPanel mainPanel;
    private JLabel nameLabel,passwordLabel;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton button1,button2;
    
    
    
    public MyWindow(){
        super.setTitle("MY FIRST FORM");
        super.setSize(500,500);
        super.setLocation(100,200);
        //setVisible is important because sometimes out form is invisible
        
        //if i will give here value false then the form will be not visible to us
        super.setBackground(Color.green);
        this.createGUI();
        super.setVisible(true);
       
        System.out.println("this is my constructor");
    }
    public void createGUI(){
        //we are using this method for designing
        this.setLayout(new BorderLayout());
        heading = new JLabel("MY VERY FIRST PROJECT");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);
        this.add(heading,BorderLayout.NORTH);
        //working with Jpanel//
        mainPanel=new JPanel();
        mainPanel.setLayout(new GridLayout(3,2));
        nameLabel=new JLabel("ENTER NAME :");
        nameLabel.setFont(font);
        
        
        passwordLabel=new JLabel("ENTER PASSWORD :");
        nameTextField = new JTextField();
        nameTextField.setFont(font);
        
        passwordField=new JPasswordField();
        passwordField.setFont(font);
        
        button1=new JButton("SUBMIT");
        button1.setFont(font);
        
        
        button2=new JButton("RESET");
        button2.setFont(font);
        
        
       
        
        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);
        
        
        
        
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);
        
        
        
        mainPanel.add(button1);
        mainPanel.add(button2);
        
        this.add(mainPanel,BorderLayout.CENTER);
        
        
        
        
       
        
    
}
}

