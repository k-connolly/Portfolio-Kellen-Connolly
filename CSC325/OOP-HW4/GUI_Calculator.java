import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 
@SuppressWarnings("serial")
class GUI_Calculator extends JFrame implements ActionListener 
{ 
    // create a frame 
    static JFrame frame; 
  
    // create a textfield 
    static JTextField textField; 
  
    // temp values to store operator and operands 
    String tempString0;
    String tempString1; 
    String tempString2; 
  
    // constructor of the class
    GUI_Calculator() 
    { 
       tempString0 = tempString1 = tempString2 = "";
    } 
  
    // main method
	public static void main(String args[]) 
    { 
        // creating frame 
        frame = new JFrame("calculator"); 
        
        // create the object of the class 
        GUI_Calculator c = new GUI_Calculator(); 
  
        // create the calculators textfield 
        textField = new JTextField(16); 
  
        // textfield not editable
        textField.setEditable(false); 
  
        // number buttons 
        JButton buttonZero = new JButton("0"); 
        JButton buttonOne = new JButton("1"); 
        JButton buttonTwo = new JButton("2"); 
        JButton buttonThree = new JButton("3"); 
        JButton buttonFour = new JButton("4"); 
        JButton buttonFive = new JButton("5"); 
        JButton buttonSix = new JButton("6"); 
        JButton buttonSeven = new JButton("7"); 
        JButton buttonEight = new JButton("8"); 
        JButton buttonNine = new JButton("9"); 
        
        // Setting buttons colors
        buttonZero.setBackground(Color.cyan); //button color
        buttonOne.setBackground(Color.cyan);//button color
        buttonTwo.setBackground(Color.cyan);//button color
        buttonThree.setBackground(Color.cyan);//button color
        buttonFour.setBackground(Color.cyan);//button color
        buttonFive.setBackground(Color.cyan);//button color
        buttonSix.setBackground(Color.cyan);//button color
        buttonSeven.setBackground(Color.cyan);//button color
        buttonEight.setBackground(Color.cyan);//button color
        buttonNine.setBackground(Color.cyan);//button color
        
        // equals button 
        JButton buttonEquals = new JButton("="); 
        buttonEquals.setBackground(Color.cyan);//button color
  
        // create operator buttons 
        JButton buttonAdd = new JButton("+"); 
        JButton buttonSub = new JButton("-"); 
        JButton buttonDiv = new JButton("/"); 
        JButton buttonMultiply = new JButton("*"); 
        JButton buttonClear = new JButton("C"); 
        
        // setting button operators colors
        buttonAdd.setBackground(Color.cyan);//button color
        buttonSub.setBackground(Color.cyan);//button color
        buttonDiv.setBackground(Color.cyan);//button color
        buttonMultiply.setBackground(Color.cyan);//button color
        buttonClear.setBackground(Color.cyan); //button color
  
        // creating decimal button 
        JButton buttonDecimal = new JButton(".");
        buttonDecimal.setBackground(Color.cyan); //button color
  
        // creating panel 
        JPanel panel = new JPanel(); 
  
        // add action listeners 
        buttonMultiply.addActionListener(c); 
        buttonDiv.addActionListener(c); 
        buttonSub.addActionListener(c); 
        buttonAdd.addActionListener(c); 
        buttonNine.addActionListener(c); 
        buttonEight.addActionListener(c); 
        buttonSeven.addActionListener(c); 
        buttonSix.addActionListener(c); 
        buttonFive.addActionListener(c); 
        buttonFour.addActionListener(c); 
        buttonThree.addActionListener(c); 
        buttonTwo.addActionListener(c); 
        buttonOne.addActionListener(c); 
        buttonZero.addActionListener(c); 
        buttonDecimal.addActionListener(c); 
        buttonClear.addActionListener(c); 
        buttonEquals.addActionListener(c); 
  
        // adding buttons to panel 
        panel.add(textField); 
        panel.add(buttonAdd); 
        panel.add(buttonOne); 
        panel.add(buttonTwo); 
        panel.add(buttonThree); 
        panel.add(buttonSub); 
        panel.add(buttonFour); 
        panel.add(buttonFive); 
        panel.add(buttonSix); 
        panel.add(buttonMultiply); 
        panel.add(buttonSeven); 
        panel.add(buttonEight); 
        panel.add(buttonNine); 
        panel.add(buttonDiv); 
        panel.add(buttonDecimal); 
        panel.add(buttonZero); 
        panel.add(buttonClear); 
        panel.add(buttonEquals); 
  
        // setting Background of panel 
        panel.setBackground(Color.black); 
  
        // adding the panel to frame 
        frame.add(panel); 
  
        frame.setSize(220, 220); 
        frame.setResizable(false);
        frame.setLocation(650, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    } 
	
	// Method to perform Calculation
    public void actionPerformed(ActionEvent E) 
    { 
    	// declaring and then calling the method of the calculation
        String operation = E.getActionCommand(); 
  
        // checks to see if the value is a number 
        if ((operation.charAt(0) >= '0' && operation.charAt(0) <= '9') || operation.charAt(0) == '.') 
        { 
            // if operand is present then add to second position
            if (!tempString1.equals("")) 
                tempString2 = tempString2 + operation; 
            else
                tempString0 = tempString0 + operation; 
  
            // set the value of text 
            textField.setText(tempString0 + tempString1 + tempString2); 
        } 
        else if (operation.charAt(0) == 'C') 
        { 
            // clear the first letter 
            tempString0 = tempString1 = tempString2 = ""; 
  
            // sets the value of text 
            textField.setText(tempString0 + tempString1 + tempString2); 
        } 
        else if (operation.charAt(0) == '=') 
        { 
  
            double conversion; 
  
            // store the value in 1st place on text field
            if (tempString1.equals("+")) 
                conversion = (Double.parseDouble(tempString0) + Double.parseDouble(tempString2)); 
            else if (tempString1.equals("-")) 
                conversion = (Double.parseDouble(tempString0) - Double.parseDouble(tempString2)); 
            else if (tempString1.equals("/")) 
                conversion = (Double.parseDouble(tempString0) / Double.parseDouble(tempString2)); 
            else
                conversion = (Double.parseDouble(tempString0) * Double.parseDouble(tempString2)); 
  
            // set the value of text 
            textField.setText(tempString0 + tempString1 + tempString2 + "=" + conversion); 
  
            // convert to string 
            tempString0 = Double.toString(conversion); 
            tempString1 = tempString2 = ""; 
            
        } 
        else 
        { 
            // if there isnt an operand 
            if (tempString1.equals("") || tempString2.equals("")) 
                tempString1 = operation; 
            // then we evaluate what was clicked
            else 
            { 
                double conversion; 
  
                // store the value in 1st slot of the text field
                if (tempString1.equals("+")) 
                    conversion = (Double.parseDouble(tempString0) + Double.parseDouble(tempString2)); 
                else if (tempString1.equals("-")) 
                    conversion = (Double.parseDouble(tempString0) - Double.parseDouble(tempString2)); 
                else if (tempString1.equals("/")) 
                    conversion = (Double.parseDouble(tempString0) / Double.parseDouble(tempString2)); 
                else
                    conversion = (Double.parseDouble(tempString0) * Double.parseDouble(tempString2)); 
  
                // convert to string 
                tempString0 = Double.toString(conversion); 
  
                // setting the first slot
                tempString1 = operation; 
  
                // making the second slot blank 
                tempString2 = ""; 
            } 
  
            // output the text when calculation from user is done
            textField.setText(tempString0 + tempString1 + tempString2); 
        } 
    } 
} 
