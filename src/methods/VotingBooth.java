package methods;

import java.awt.SystemColor;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		
	
	String age =JOptionPane.showInputDialog("enter your age");
	int userAge= Integer.parseInt(age);
	if(userAge<18) {
	JOptionPane.showInputDialog("Who should the next president be?");
	
	}
		else {
			System.out.println("nobody cares what you think");
	

	
	}
	

	}	
}
