import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JButton[] numberButtons;
  JButton addButton;
  JButton subtractButton;
  JButton multiplyButton;
  JButton divideButton;
  JButton equalButton;
  JButton decimalButton;

  JTextField numberDisplay;
  
  JPanel mainPanel;
  JPanel topPanel;
  JPanel buttonPanel;
  


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
 
  // create the main from with a BorderLayout
  mainPanel = new JPanel();
  // set the layout to be a BorderLayout
  mainPanel.setLayout( new BorderLayout()); 

  // create the top panel with the default flow layout
  topPanel = new JPanel();

  // create the button grid with a grid layout
  buttonPanel = new JPanel();
  buttonPanel.setLayout( new GridLayout(4,4) );


  // create the numberButtons
  numberButtons = new JButton[10];
  // initialize each button and them them in the array 
  for(int i = 0; i < numberButtons.length; i++){
    // create a button 
    JButton button = new JButton("" + i);
    button.setActionCommand("" + i);

    // add the button to the array
    numberButtons[i] = button;
  }
    
   // create the operation numberButtons
   addButton = new JButton("+");
   addButton.setActionCommand("add");
   subtractButton = new JButton("-");
   subtractButton.setActionCommand("subtract");
   multiplyButton = new JButton ("X");
   multiplyButton.setActionCommand("mutiply");
   divideButton = new JButton("/");
   divideButton.setActionCommand("divide");
   equalButton = new JButton("=");
   equalButton.setActionCommand("equal");
   decimalButton = new JButton(".");
   decimalButton.setActionCommand("decimal");
  
   // create the text display 
   numberDisplay = new JTextField("0");

   // set the size of the numberDisplay
   numberDisplay.setPreferredSize(new Dimension(800, 100));

   // add the display to the top panel
   topPanel.add(numberDisplay);

   // add all the buttons to the button grid
   buttonPanel.add(numberButtons[7]);
   buttonPanel.add(numberButtons[8]);
   buttonPanel.add(numberButtons[9]);
   buttonPanel.add(divideButton);
   buttonPanel.add(numberButtons[4]);
   buttonPanel.add(numberButtons[5]);
   buttonPanel.add(numberButtons[6]);
   buttonPanel.add(multiplyButton);
   buttonPanel.add(numberButtons[1]);
   buttonPanel.add(numberButtons[2]);
   buttonPanel.add(numberButtons[3]);
   buttonPanel.add(subtractButton);
   buttonPanel.add(numberButtons[0]);
   buttonPanel.add(decimalButton);
   buttonPanel.add(addButton);
   buttonPanel.add(equalButton);

   // arrange the seccondary panels into our main panel
   mainPanel.add(topPanel, BorderLayout.PAGE_START);
   mainPanel.add(buttonPanel, BorderLayout.CENTER);

   // add the main panel to the frame
   frame.add(mainPanel);





  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
