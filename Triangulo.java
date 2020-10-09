import javax.swing.*;
import java.awt.*;
public class Triangulo{
	public static void main(String [] ar){
		Marco mimarco = new Marco();
		mimarco.setDefaultCloseOperation(3);
		mimarco.setResizable(false);
		mimarco.setSize(300,300);
		mimarco.setLocationRelativeTo(null);
		mimarco.setVisible(true);
		mimarco.setTitle("Alfredi 9-oct-2020");
		mimarco.setBackground(Color.gray);
	}
}
class Marco extends JFrame{
	public Marco(){
		Lamina milamina = new Lamina();
		add(milamina);
	}
}
class Lamina extends JPanel{
	public void paint(Graphics g){
		g.setColor(Color.orange);
		g.drawLine(20,200,200,200);
		g.drawLine(20,200,100,20);
		g.drawLine(200,200,100,20);
	}
}