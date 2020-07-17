import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//-----------------------------------------//
public class Hw3_GUI 
{
	//Frame1 and panels for frame1//
	JFrame frame1 = new JFrame("Dimensions Window");
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel4 = new JPanel();
	
	//Frame2 set to show results from users input//
	JFrame frame2 = new JFrame("Results");
	
	//Panels for frame 2//
	JPanel panel3 = new JPanel();
	JPanel panel5 = new JPanel();
	
	//Label and textfield for Width//
	JLabel widthLabel = new JLabel("Width: ");
		JTextField width = new JTextField("225");
		
	//Label and textfield for height//
	JLabel heightLabel = new JLabel("Height: ");
		JTextField height = new JTextField("225");
		
	//Label and text field for title//
	JLabel titleLabel = new JLabel("Title: ");
		JTextField title = new JTextField("Designated Dimensions");
		
	//Button for frame 1 to print 'result' window//
	JButton button = new JButton("View Result");
	
	public Hw3_GUI()
	{
		//Setting size and location for the windows//
		frame1.setLocation(675, 350);
		frame1.setSize(300, 130);
		frame2.setLocation(1000, 350);
		frame2.setSize(300, 100);
		
		//Orients the panels on the first window//
		frame1.add(panel1, BorderLayout.NORTH);
		frame1.add(panel2, BorderLayout.CENTER);
		frame1.add(panel4, BorderLayout.SOUTH);
		
		//Adding title to panel1 in layout north//
		panel1.add(titleLabel);
		panel1.add(title);
		
		//Adding labels and textfields in panel2 in layout center//
		panel2.add(widthLabel);
		panel2.add(width);
		panel2.add(heightLabel);
		panel2.add(height);
		
		//Added button to panel4 in layout South for better placement//
		panel4.add(button);
		button.setAlignmentX(Component.TOP_ALIGNMENT);
		button.addActionListener(new ButtonListener());
		
		//Display the window and close the whole program if the 2nd window is closed//
		frame1.setVisible(true);
		//frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); <-- added just incase
		
		//Will not close all of program if frame1 is closed//
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Extras for coloring//
		//Gives it some pop to it//
		panel1.setBackground(Color.cyan);
		panel2.setBackground(Color.cyan);
		panel3.setBackground(Color.cyan);
		panel4.setBackground(Color.cyan);
		panel5.setBackground(Color.cyan);
	}
	
	public class ButtonListener implements ActionListener
	{

		@Override //Unimplemented Method
		public void actionPerformed(ActionEvent arg0) 
		{
			//Adding panels for better layout in window 2//
			frame2.add(panel3, BorderLayout.NORTH);
			frame2.add(panel5, BorderLayout.CENTER);
			
			//All contents needed for second window//
			//Adding title seperately for better format, on its own panel in layout north//
			panel3.add(titleLabel);
			panel3.add(title);
			
			//Adding contents in seperate panel for better format, on its own panel in layout center//
			panel5.add(widthLabel);
			panel5.add(width);
			panel5.add(heightLabel);
			panel5.add(height);
			
			//Displaying 2nd window//
			frame2.setVisible(true);
		}
		
	}
	
	//Executing the window in main method//
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Hw3_GUI GUI = new Hw3_GUI();
	}

}
