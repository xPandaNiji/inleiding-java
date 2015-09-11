package h04_4_8_TextFields;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;

public class Histogram extends Applet{
	
	int valerie = 40;
	int jeroen = 100;
	int hans = 80;
	Label valerieLabel = new Label("Valerie:");
	Label jeroenLabel = new Label("Jeroen:");
	Label hansLabel = new Label("Hans:");
	TextField valerieInput = new TextField("", 5);
	TextField jeroenInput = new TextField("", 5);
	TextField hansInput = new TextField("", 5);
	Button button = new Button("OK");
	
	public void init(){
		setSize(800, 600);
		add(valerieLabel); valerieLabel.setBackground(Color.magenta);
		add(valerieInput); valerieInput.addActionListener(new InputListener());
		add(jeroenLabel); jeroenLabel.setBackground(Color.cyan);
		add(jeroenInput); jeroenInput.addActionListener(new InputListener());
		add(hansLabel); hansLabel.setBackground(Color.yellow);
		add(hansInput); hansInput.addActionListener(new InputListener());
		add(button); button.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g){
		
		/* Coordinate System */
		g.drawLine(getWidth()/5, getHeight()/8*7, getWidth()/5*4, getHeight()/8*7);	//x-axis
		g.drawLine(getWidth()/5, getHeight()/8*7, getWidth()/5, 100); //y-axis
		g.drawString("100", getWidth()/5-(35+getWidth()/100), 105);
		g.drawLine(getWidth()/5-(5+getWidth()/100), 100, getWidth()/5+(5+getWidth()/100), 100); //y=100
		g.drawString("80", getWidth()/5-(28+getWidth()/100), 105+(getHeight()/8*7-100)/5);
		g.drawLine(getWidth()/5-(5+getWidth()/100), 100+(getHeight()/8*7-100)/5, getWidth()/5+(5+getWidth()/100), 100+(getHeight()/8*7-100)/5); //y=80
		g.drawString("60", getWidth()/5-(28+getWidth()/100), 105+(getHeight()/8*7-100)/5*2);
		g.drawLine(getWidth()/5-(5+getWidth()/100), 100+(getHeight()/8*7-100)/5*2, getWidth()/5+(5+getWidth()/100), 100+(getHeight()/8*7-100)/5*2); //y=60
		g.drawString("40", getWidth()/5-(28+getWidth()/100), 105+(getHeight()/8*7-100)/5*3);
		g.drawLine(getWidth()/5-(5+getWidth()/100), 100+(getHeight()/8*7-100)/5*3, getWidth()/5+(5+getWidth()/100), 100+(getHeight()/8*7-100)/5*3); //y=40
		g.drawString("20", getWidth()/5-(28+getWidth()/100), 105+(getHeight()/8*7-100)/5*4);
		g.drawLine(getWidth()/5-(5+getWidth()/100), 100+(getHeight()/8*7-100)/5*4, getWidth()/5+(5+getWidth()/100), 100+(getHeight()/8*7-100)/5*4); //y=20

		/* Arrow */
		g.drawString("y in kg", getWidth()/10-30, 90+(getHeight()/8*7-100)/10);
		g.drawLine(getWidth()/10-15, 100+(getHeight()/8*7-100)/10, getWidth()/10-15, 100+(getHeight()/8*7-100)/10*9); //arrow mid
		g.drawLine(getWidth()/10-15, 100+(getHeight()/8*7-100)/10, getWidth()/10-15-getWidth()/60, 100+(getHeight()/8*7-100)/10+getHeight()/25); //arrow left
		g.drawLine(getWidth()/10-15, 100+(getHeight()/8*7-100)/10, getWidth()/10-15+getWidth()/60, 100+(getHeight()/8*7-100)/10+getHeight()/25); //arrow right

		/* Bars */
		g.setColor(Color.magenta);
		g.fillRect(getWidth()/5+(getWidth()/5*3)/10*1, getHeight()/8*7-(getHeight()/8*7-100)*valerie/100, (getWidth()/5*3)/5, (getHeight()/8*7-100)*valerie/100); //Valerie
		g.setColor(Color.cyan);
		g.fillRect(getWidth()/5+(getWidth()/5*3)/10*4, getHeight()/8*7-(getHeight()/8*7-100)*jeroen/100, (getWidth()/5*3)/5, (getHeight()/8*7-100)*jeroen/100); //Jeroen
		g.setColor(Color.yellow);
		g.fillRect(getWidth()/5+(getWidth()/5*3)/10*7, getHeight()/8*7-(getHeight()/8*7-100)*hans/100, (getWidth()/5*3)/5, (getHeight()/8*7-100)*hans/100); //Hans
		g.setColor(Color.black);
		g.drawRect(getWidth()/5+(getWidth()/5*3)/10*1, getHeight()/8*7-(getHeight()/8*7-100)*valerie/100, (getWidth()/5*3)/5, (getHeight()/8*7-100)*valerie/100); //Valerie outline
		g.drawRect(getWidth()/5+(getWidth()/5*3)/10*4, getHeight()/8*7-(getHeight()/8*7-100)*jeroen/100, (getWidth()/5*3)/5, (getHeight()/8*7-100)*jeroen/100); //Jeroen outline
		g.drawRect(getWidth()/5+(getWidth()/5*3)/10*7, getHeight()/8*7-(getHeight()/8*7-100)*hans/100, (getWidth()/5*3)/5, (getHeight()/8*7-100)*hans/100); //Hans outline
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			valerie = Integer.parseInt(valerieInput.getText());
			jeroen = Integer.parseInt(jeroenInput.getText());
			hans = Integer.parseInt(hansInput.getText());
			repaint();
		}
	}
	
}