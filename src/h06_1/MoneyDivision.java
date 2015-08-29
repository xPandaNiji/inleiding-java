package h06_1;

import java.applet.Applet;
import java.awt.Graphics;

public class MoneyDivision extends Applet{

	double cash = (double) 113 / 4;
	
	public void init() {
		
	}
	
	public void paint(Graphics g) {
		g.drawString("Jan krijgt €" + cash, 20, 20);
		g.drawString("Ali krijgt €" + cash, 20, 35);
		g.drawString("Jeanette krijgt €" + cash, 20, 50);
		g.drawString("Daniel krijgt €" + cash, 20, 65);
	}
	
}
