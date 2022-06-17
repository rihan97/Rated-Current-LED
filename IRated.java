package uk.ac.mmu.cnt.one;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
public class IRated {

	public static void main(String[] args) throws IOException{
		
		//declare some variables
		
		double vSupply;
		double vForward;
		double iRated;
		double resistorValue;
		
		String resistorValueStr;
		String vForwardStr;
		String vSupplyStr;
		
		//set up a reader form the console window
		BufferedReader console =
				new BufferedReader (new InputStreamReader(System.in));
		
		//read in values interactively from the command line
		System.out.println("Please enter a value for the supply voltage: ");
		vSupplyStr = console.readLine();
		vSupply = Double.parseDouble(vSupplyStr);
		
		System.out.println("Please enter a value for the forward voltage of the LED:");
		vForwardStr = console.readLine();
		vForward = Double.parseDouble(vForwardStr);
		
		System.out.println("Please enter a value for the resistor value of the LED: ");
		resistorValueStr = console.readLine();
		resistorValue = Double.parseDouble(resistorValueStr);
		
	
		//for debugging we want to display our values to make sure everything is ok
		System.out.println("We have: ");
		System.out.println("Supply Voltage = " + vSupply);
		System.out.println("Forward Voltage = " + vForward);
		System.out.println("resistorValue = " + resistorValue);
		
		
		//Calculate our resistor value
		iRated = vSupply - vForward / resistorValue;
		
		//Display  the value
		System.out.println("We need a " + iRated + " Ohm resistor!");
				

	}

}
