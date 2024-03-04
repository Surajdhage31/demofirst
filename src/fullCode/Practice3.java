package fullCode;
import java.awt.*;
//public class Practice3 extends java.applet.Applet{
// public void paint(Graphics g)
// {
//	 g.drawString("hi suraj", 10, 20);
// }
//}
public class Practice3 {
	Practice3()
	{
		Frame f = new Frame();
		Button b  = new Button("Click me");
		b.setBounds(50,50,50,50);
		f.add(b);
		f.setSize(325,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		Practice3 f = new Practice3();
		
	}
}