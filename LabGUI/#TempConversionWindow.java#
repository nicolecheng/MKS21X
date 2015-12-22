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
	C.setActionCommand("FtoC");
	JButton F = new JButton("toF");
	F.addActionListener(this);
	F.setActionCommand("CtoF");

	text = new JTextField(10);
	label = new JLabel("this is a JLabel");

	pane.add(text);
	pane.add(C);
	pane.add(F);
	pane.add(label);
	
    }
    
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	try{
	    if(event.equals("FtoC")){
		String s = text.getText();
		double m = Double.parseDouble(s);
		m = (m - 32) * 5 / 9;
		label.setText(m+" degrees Celcius");
	    }
	    if(event.equals("CtoF")){
		String s = text.getText();
		double m = Double.parseDouble(s);
		m = m * 9 / 5 + 32;
		label.setText(m+" degrees Fahrenheit");    
	    }
	}catch(NullPointerException x){
	    label.setText("Sorry -- your 'number' input is invalid");
	}
 
 
    }

    public static void main (String[]args){
	TempConversionWindow t = new TempConversionWindow();
	t.setVisible(true);
    }


}
