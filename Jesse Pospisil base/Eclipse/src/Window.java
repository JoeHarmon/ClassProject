import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Window {
	private JFrame frame;
	
	public Window()
	{
		frame = new JFrame("Window");
		Container contentPane = frame.getContentPane();
		JLabel label = new JLabel("Label");
		contentPane.add(label);
		
		frame.pack();
		frame.setVisible(true);
	}
}
