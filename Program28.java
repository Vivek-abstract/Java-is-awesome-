import java.awt.*;
import java.applet.*;

/*
 *  g.setColor(Color.value);
 *  g.fillOval(x, y, width, height)
 *  g.fillPolygon(xPoints, yPoints, nPoints)
 *  g.fillArc(x, y, width, height, startAngle, arcAngle)
*/
public class Program28 extends Applet {
	
	/*
	 <applet code = Program28.class height = 250 width = 250>
	 </applet>
	 */
	
	public void paint(Graphics g){
		
		//face
		g.setColor(Color.yellow);
		g.fillOval(10, 10, 250, 250);
		
		//eyes
		g.setColor(Color.black);
		g.fillOval(70, 90, 40, 40);
		g.fillOval(160, 90, 40, 40);
		
		//nose
		int x[] = {115,135,155};
		int y[] = {170,140,170};
		g.fillPolygon(x , y, 3);
		
		//mouth
		g.fillArc(80, 140, 110, 80, 180, 180);
		g.setColor(Color.yellow);
		g.fillArc(80, 150, 110, 50, 180, 180);
		
	}
	//That's a creepy looking smiley
}
