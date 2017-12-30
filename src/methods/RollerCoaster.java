package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {

	
	public static void main(String[] args) {
		String height =JOptionPane.showInputDialog("What is your height in inches?");
		int userHeight=Integer.parseInt(height);
		if(userHeight<48){
		JOptionPane.showInputDialog("you can come on the ride");
		
		
	}
	
		else {
			System.out.println("Grow more and come back another time");
		}
	
	
	
	
	
	
	
	
}}
