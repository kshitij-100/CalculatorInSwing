import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener
{
	JLabel l1;
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	Calculator()
	{
		setLayout(null);

		t1 = new JTextField();
		t2 = new JTextField();
		b1 = new JButton("ADD");
		b2 = new JButton("SUBTRACT");
		b3 = new JButton("MULTIPLY");
		b4 = new JButton("DIVIDE");
		l1 = new JLabel("");

		t1.setBounds(40,30,320,40);
		t2.setBounds(40,90,320,40);
		b1.setBounds(40,150,130,40);
		b2.setBounds(220,150,130,40); 
		b3.setBounds(40,210,130,40);
		b4.setBounds(220,210,130,40);
		l1.setBounds(40,290,320,40);

		add(t1);add(t2);add(b1);add(b2);add(b3);add(b4);add(l1);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		setSize(400,400);
		setTitle("Calculator In Java");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		double a = Double.parseDouble(t1.getText());
		double b = Double.parseDouble(t2.getText());
		double c;
		String cmd = ae.getActionCommand();

		switch(cmd)
		{
		case "ADD":
			 c = a + b;
			l1.setText(a+" + "+b+" = "+c);
			JOptionPane.showMessageDialog(this,"The Addtion is "+c);
			break;

		case "SUBTRACT":
			 c = a - b;
			l1.setText(a+" - "+b+" = "+c);
			JOptionPane.showMessageDialog(this,"The Substraction is "+c);
			break;

		case "MULTIPLY":
			 c = a * b;
			l1.setText(a+" X "+b+" = "+c);
			JOptionPane.showMessageDialog(this,"The Multiplication is "+c);
			break;

		case "DIVIDE":
			 c = a / b;
			l1.setText(a+" / "+b+" = "+c);
			JOptionPane.showMessageDialog(this,"The Division is "+c);
			break;
		}
	}
	public static void main(String[] args) {
		new Calculator();
	}
}