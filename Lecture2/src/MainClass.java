import javax.swing.JFrame;

public class MainClass
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		Component theComponent = new Component();
		
		frame.add(theComponent);
		frame.setSize(1920,1080);
		frame.setTitle("Java Gurus");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}