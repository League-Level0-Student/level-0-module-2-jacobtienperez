package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
	public static void main(String[] args) {
		Random poop=new Random();
		int num=poop.nextInt(101);
		int numg=poop.nextInt(277);
		int num3=((150-50)+1) + 50;
		int numd=((387-92)+1)+92;
		int nump=poop.nextInt(2);
		
		
		JOptionPane.showMessageDialog(null, "Numbers " +num+"," +numg+"," +numd+","+nump+"");
	}

	
}
