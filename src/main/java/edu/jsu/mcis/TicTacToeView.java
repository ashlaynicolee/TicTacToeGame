package edu.jsu.mcis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeView extends JPanel implements ActionListener {

   private TicTacToeModel model;
   
   /* CONSTRUCTOR */
   
   private JButton[][] squares;
   private JPanel squaresPanel;
   private JLabel resultLabel;
	
   public TicTacToeView(TicTacToeModel model) {
      
      this.model = model;
      
      int width = model.getWidth();
   
      setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      squares = new JButton[width][width];
      squaresPanel = new JPanel(new GridLayout(width,width));
      resultLabel = new JLabel();
      resultLabel.setName("ResultLabel");
        
     /* Loop through all rows and columns of the grid and: create a new
        JButton and assign it to the current grid element, add "this"
        (the View object) as the ActionListener, set the JButton's name
        to "SquareXY" (where X is the row and Y is the column), set the
        preferred size to 64x64 pixels, and add the new square to the
        "squaresPanel" JPanel created earlier. */
        
        /* INSERT CODE HERE */
        
      add(squaresPanel);
      add(resultLabel);
        
      resultLabel.setText("Welcome to Tic-Tac-Toe!");
   
   }
	
   public void viewModel() {
      
      /* Print the board to the console (see examples) */
      
      int c = 0;
      System.out.print("  ");
      
      while(c < model.getWidth())
      {
         System.out.print(c);
         c++; 
      }
      
      System.out.println("\n");
      
      for(int i = 0; i < model.getWidth(); i++)
      {
         System.out.print(i + " ");
        
         for(int j = 0; j < model.getWidth(); j++)
         {
            System.out.print(model.getMark(i,j));
         }
       
         System.out.println();
      } 
     
   }

   @Override
    public void actionPerformed(ActionEvent event) {
        
      String name = ((JButton) event.getSource()).getName();
        
        /* Extract the ROW and COL from the string name (remember, the squares
           should all be named "SquareXY", so the ROW should be extracted from
           position 6 of this string, and the COL from position 7.  Remember to
           convert both to Integers!) */
   
        /* INSERT CODE HERE */
           
        /* Call makeMark() to place the mark in the Model */
        
        /* INSERT CODE HERE */
   
        /* Update the squares of the View using the "updateSquares()" method
           (see below); this is the equivalent of re-printing the grid to the
           console in Part One. */
   
      updateSquares();
   
        /* Clear the "showResult" label at the bottom of the View */
        
      showResult(" ");
        
        /* If the game is over (that is, if the "getResult()" method returns
           a result other than Result.NONE), loop through all the JButtons in
           the View and disable them to prevent further entries.  (Hint: the
           JButton class provides a "setEnabled()" method for this.) */
           
        /* INSERT CODE HERE */
        
   }
        
   public void updateSquares() {
   
        /* Loop through all of the rows and columns in the JButton grid and
           reset the button text to match the corresponding marks as returned
           by "getMark()" (to update the View to match the Model) */
           
        /* INSERT CODE HERE */
   
   }
     
   public void showNextMovePrompt() {
   
      /* Display a prompt for the player's next move (see examples) */
   
      if(model.isXTurn())
      {
         System.out.println("\n\n" + "Player 1 (X) Move:");
         System.out.print("Enter the row and column numbers, separated by a space: ");
      }
      else
      {
         System.out.println("\n\n" + "Player 2 (O) Move:");
         System.out.print("Enter the row and column numbers, separated by a space: ");
      }
   
   }

   public void showInputError() {
   
      /* Display an error if input is invalid (see examples) */
   
      System.out.println("Error, invalid answer.");
   }
	
   public void showResult(String message) {
      resultLabel.setText(message);
   }

}