package edu.jsu.mcis;

public class TicTacToeView {

   private TicTacToeModel model;
   
   /* CONSTRUCTOR */
	
   public TicTacToeView(TicTacToeModel model) {
      
      this.model = model;
      
   }
	
   public void viewModel() {
      
      /* Print the board to the console (see examples) */
      
      int c = 0;
      System.out.print(" ");
      
      while(c < model.getWidth())
      {
         System.out.print(c);
         c++; 
      }
      
      System.out.println("\n\n");
      
      for(int i = 0; i < model.getWidth(); i++)
      {
         System.out.print(i + " ");
        
         for(int j = 0; j <= model.getWidth()-1; j++)
         {
            System.out.print(model.getMark(i,j));
         }
       
         System.out.println();
      } 
     
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

   public void showResult(String r) {
   
      /* Display final winner */
   
      System.out.println(r + "!");
   
   }
	
}