import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class displayWindow {

	private JTextArea txtrTextarea = new JTextArea();
	private JFrame frmStudentProjectManager;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					displayWindow window = new displayWindow();
					window.frmStudentProjectManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public displayWindow() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		/*
		 * Declaration and set-up of the window
		 */
		frmStudentProjectManager = new JFrame();
		frmStudentProjectManager.setTitle("Student Project Manager v1.0");
		frmStudentProjectManager.setBounds(100, 100, 506, 499);
		frmStudentProjectManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentProjectManager.setLocationRelativeTo(null);
		
		// MENU BAR //
		JMenuBar menuBar = new JMenuBar();
		frmStudentProjectManager.setJMenuBar(menuBar);
		
		// MENU TAB 'FILE' //
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		// MENU TAB 'PROJECT' //
		JMenu mnProject = new JMenu("Project");
		menuBar.add(mnProject);
		frmStudentProjectManager.getContentPane().setLayout(null);
		
		// MENU ITEM 'SAVE' //
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				/*
				 * we need a save dialog, since we are saving a file here.The return value tells us if saving the file has been approved or canceled.
				 */
				JFileChooser jfc = new JFileChooser();
				int returnVal = jfc.showSaveDialog(null);
					if (returnVal == JFileChooser.APPROVE_OPTION) 
					{
						try { //This throws an exception, so you need a try/catch block
							BufferedWriter bw = new BufferedWriter(new FileWriter(jfc.getCurrentDirectory() + "//output.txt")); //Create a BufferedWriter for the file
							bw.write(txtrTextarea.getText()); //write everything in the textarea to file
							bw.close(); //Always close your buffered writer when you're done
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
			}
		});
		mnFile.add(mntmSave);
		
		// MENU ITEM 'LOAD' //
		JMenuItem mntmLoad = new JMenuItem("Load");
		mntmLoad.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				/*
				 * //we need an open dialog, since we are opening a file here. The return value tells us if opening the file has been approved or canceled
				 */
				JFileChooser jfc = new JFileChooser();
				int returnValue = jfc.showOpenDialog(null); 
					if(returnValue == JFileChooser.APPROVE_OPTION) 
					{
						@SuppressWarnings("unused")
						File selectedFile = jfc.getSelectedFile();
						try { //this throws an exception, so you need a try/catch block
							BufferedReader br = new BufferedReader(new FileReader(jfc.getSelectedFile())); //create a BufferedReader for the file selected with filechooser
							String strCurrentLine;
							while((strCurrentLine = br.readLine()) != null) 
							{ //read lines from file as long as there are more lines to read
								txtrTextarea.append(strCurrentLine + "\n"); //put each line into the textarea
							}
							br.close(); //Always close your buffered reader when you're done
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
			}
		});
		mnFile.add(mntmLoad);
		
		// MENU ITEM 'EXIT' //
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		// Adding text area and setting the bounds //
		txtrTextarea.setBounds(0, 0, 488, 426);
		frmStudentProjectManager.getContentPane().add(txtrTextarea);
	}
	
}
