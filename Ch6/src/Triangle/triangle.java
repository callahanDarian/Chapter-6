package Triangle;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class triangle {

	public static void main(String[] args) 
	{
		double answer;
		int side = Integer.parseInt(JOptionPane.showInputDialog(null, "Which side are you solving for? Input the number.\n1.  A\n2.  B\n3.  C"));
		
		
		//Solving for A
		if (side == 1)
		{		
		JTextField unknownLengthOne = new JTextField();
	    JTextField unknownLengthTwo = new JTextField();
	    Object[] message = 
	    {
	    	    "Length of B:", unknownLengthOne,
	    	    "Length of C:", unknownLengthTwo
	    };
	    
	    JOptionPane.showConfirmDialog(null, message, "Triangle", JOptionPane.OK_CANCEL_OPTION);
	    double LengthOne = Double.parseDouble(unknownLengthOne.getText());
	    double LengthTwo = Double.parseDouble(unknownLengthTwo.getText());
	    
	    answer = (Math.pow(LengthTwo, 2)) - (Math.pow(LengthOne, 2));
	    answer = (Math.sqrt(answer));
	    JOptionPane.showMessageDialog(null, answer);
		}
		
		//Solving for B
		else if (side == 2)
		{		
		JTextField unknownLengthOne = new JTextField();
	    JTextField unknownLengthTwo = new JTextField();
	    Object[] message = 
	    {
	    	    "Length of A:", unknownLengthOne,
	    	    "Length of C:", unknownLengthTwo
	    };
	    
	    JOptionPane.showConfirmDialog(null, message, "Triangle", JOptionPane.OK_CANCEL_OPTION);
	    double LengthOne = Double.parseDouble(unknownLengthOne.getText());
	    double LengthTwo = Double.parseDouble(unknownLengthTwo.getText());
	    
	    answer = (Math.pow(LengthTwo, 2)) - (Math.pow(LengthOne, 2));
	    answer = (Math.sqrt(answer));
	    JOptionPane.showMessageDialog(null, answer);
		}
		
		//Solving for C
		else if (side == 3)
		{		
		JTextField unknownLengthOne = new JTextField();
	    JTextField unknownLengthTwo = new JTextField();
	    Object[] message = 
	    {
	    	    "Length of A:", unknownLengthOne,
	    	    "Length of B:", unknownLengthTwo
	    };
	    
	    JOptionPane.showConfirmDialog(null, message, "Triangle", JOptionPane.OK_CANCEL_OPTION);
	    double LengthOne = Double.parseDouble(unknownLengthOne.getText());
	    double LengthTwo = Double.parseDouble(unknownLengthTwo.getText());
 
	    answer = (Math.pow(LengthOne, 2)) + (Math.pow(LengthTwo, 2));
	    answer = (Math.sqrt(answer));
	    JOptionPane.showMessageDialog(null, answer);
		}
	}

}
