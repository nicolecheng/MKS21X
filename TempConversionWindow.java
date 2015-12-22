import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel label;
    private JTextField text;

    public TempConversionWindow(){
	this.setTitle("Temperature Conversion");
	this.setSize(400,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton C = new JButton("toC");
	C.addActionListener(this);
	JButton F = new JButton("toF");
	F.addActionListener(this);

	text = new JTextField(10);

	pane.add(text);
	pane.add(C);
	pane.add(F);
	//pane.add(
	//pane.add(
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();

 
 
    }


}
