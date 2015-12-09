import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Vsi4ki beli poleta sa sys sbor na koordinatite nechetni chisla.		
// Vsi4ki cherni poleta sa sys sbor na koordinatite chetni chisla
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please imput 2 cessboard coordinates using this way: (horizontal), (vertical) position of the first and (horisontal) (vertical) position of the second number.");
		
		byte hori = sc.nextByte();
		byte ver = sc.nextByte();
		byte hori1 = sc.nextByte();
		byte ver1 = sc.nextByte();
		
				
		if ((hori + ver) % 2 == (hori1 + ver1) % 2){
			System.out.println("Positions are with the same colour.");
		}
		else {
			System.out.println("Positions are with different colour.");
		}
		
	}

}
