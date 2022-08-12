import javax.swing.*;

public class FirstGUI3
{
	public static void main (String args[])
	{
		JFrame frm = new JFrame("My first GUI");
		frm.setSize(600,500);//width, height
		
		JButton btn1 = new JButton("CLICK ME");
		btn1.setBounds(100,50,150,60);
		frm.add(btn1);
		
		JButton btn2 = new JButton("Ok");
		btn2.setBounds(260,50,150,60);
		frm.add(btn2);
		
		JLabel lbl = new JLabel("Click on the click me");
		lbl.setBounds(100,130,150,60);
		frm.add(lbl);
		
		frm.setLayout(null);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
