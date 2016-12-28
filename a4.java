// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 4

import java.util.Scanner;
import java.io.IOException;

public class a4{
 public static void main(String args[]) {
  Scanner keyboard = new Scanner( System.in );
    
  
  System.out.println("Welcome to Memory Game");
  
  int board_side;
  
  //obtain the board size, or more specifically 
  // the length of the side of the board
  do{
   System.out.println("\n For 2x2 board game press 2"+
    "\n For 4x4 board game press 4"+
     "\n For 6x6 board game press 6");
   board_side=keyboard.nextInt();
  }while(board_side!=2 && board_side!=4 && board_side!=6);
  
  char[][] board = createBoard(board_side);
 
  shuffleBoard(board);
 
  playGame(board); 
    
 }
  
 /* this method that creates the board filled with letters of alphabet, 
  where each letter appears exactly 2 times
  e.g., for 4 x 4, the returned board would look like:
  A B C D 
  E F G H
  A B C D 
  E F G H */
    
  public static char[][] createBoard(int side) 
 {
  char[][] tmp = new char[side][side];
  int letter_count=0;
  for (int row = 0; row < tmp.length/2; row++){
   for(int col = 0; col < tmp[row].length; col++)
   {
    tmp[row][col]=(char)('A'+letter_count);
    tmp[row+tmp.length/2 ][col]=tmp[row][col];
    letter_count++;
   }
  }
  return tmp;
 }
  
 // The following method shuffles an 2D array caled board
 // Proceeding from left to right, we pick a random element from deck[i] through deck[N-1] 
 // (each element equally likely) and exchange it with deck[i]. 
 public static void shuffleBoard(char[][] board)
 {
  // Create a 1D array where whose size is equal to the size of the board   
  int N = board.length*board.length;
  char[] board1D = new char[N];
   
  // Copy the elements of 2D array into that 1D array 
  int i=0;  
  for (int row = 0; row < board.length; row++){
   for(int col = 0; col < board[row].length; col++)
   {
    board1D[i]=board[row][col];
    i++;
   }
  }
   
   
  // Shuffle 1D array 
  for (i = 0; i < N; i++) 
  { 
   int r = i + (int) (Math.random() * (N-i)); 
   char t = board1D[r]; 
   board1D[r] = board1D[i]; 
   board1D[i] = t; 
  }    
  
  //Copy shuffled 1D array back into 2D array, i.e., back to the board
  i=0;  
  for (int row = 0; row < board.length; row++){
   for(int col = 0; col < board[row].length; col++)
   {
    board[row][col]= board1D[i];
    i++;
   }
  }
 }
  
  
 // a game playing method
 public static void playGame(char[][] board)
 {
  Scanner keyboard = new Scanner( System.in );
    
  // create a 2D array indicating what locations are paired, i.e., discovered
  // at the begining none are, so default initializaiton to false is ok 
  boolean[][]discovered=new boolean[board.length][board[0].length];; 
 
  //counter for the number of discovered locations. when it is equal to the size of the board the game ends.
  int num_discovered=0; 
  int loc1_row, loc1_col, loc2_row, loc2_col; // row and column of the two new locations to be revealed.
 
  while(num_discovered!=board.length*board[0].length){
     
   clear_screen();
     
   printCurrentBoard(board, discovered);
     
   // get two new locations to be revealed from the player
     
   System.out.print("Enter a pair of undiscovered distinct locations on the board that you want revealed. "
    +"\n i.e., a pair of integers in the range [1, "+ board.length +"]");
   
   
   do{
    System.out.println("\n Enter the first location:");
    loc1_row=keyboard.nextInt()-1;
    loc1_col=keyboard.nextInt()-1;
    if(loc1_row<0 || loc1_row >  board.length-1 || loc1_col<0 || loc1_col >  board.length-1){
     System.out.println(" The location is invalid. It is outside of the board.");
    }
    else if(discovered[loc1_row][loc1_col]){
     System.out.println("The location is invalid. It is already discovered.");
    }
    else{
    }
    
   }while(loc1_row<0 || loc1_row >  board.length-1 || loc1_col<0 || loc1_col >  board.length-1 || discovered[loc1_row][loc1_col]);
   
   do{
    System.out.println("\n Enter the second location:");
    loc2_row=keyboard.nextInt()-1;
    loc2_col=keyboard.nextInt()-1;
    if(loc2_row<0 || loc2_row >  board.length-1 || loc2_col<0 || loc2_col >  board.length-1){
     System.out.println(" The location is invalid. It is outside of the board.");
    }
    else if(discovered[loc2_row][loc2_col]){
     System.out.println("The location is invalid. It is already discovered.");
    }
    else if(loc1_row==loc2_row && loc1_col==loc2_col){
     System.out.println("The location is invalid. The second location equals the first.");
    }
    else{
     
    }
     
   }while(loc2_row<0 || loc2_row >  board.length-1 || loc2_col<0 || loc2_col >  board.length-1 || discovered[loc2_row][loc2_col] || (loc1_row==loc2_row && loc1_col==loc2_col));
   
     
   // print the current board with the two new locations
   printBoardAndTwoNew(board, discovered, loc1_row, loc1_col, loc2_row, loc2_col);
     
   //wait for the player to look at it
   waitForPlayer();

   clear_screen();
     
   // due to all the testing above we know that the two newly revealed locations were not dicovered before
   // if the two newly revealed locations hold the same letter, mark them discovered
   if(board[loc1_row][loc1_col]==board[loc2_row][loc2_col]){
    discovered[loc1_row][loc1_col]=true;
    discovered[loc2_row][loc2_col]=true;
    num_discovered=num_discovered+2;
   }
  }
  //print the current board
  printCurrentBoard(board, discovered);
  System.out.println("Congratulations, you completed the game!");
   
 }
   
 
 // a method that clears the screen
 public static void clear_screen()
 {
  for (int i = 0; i < 60; i++)
   System.out.println(); 
 }
  
  
 // a method that prints the current status of the board
 public static void printCurrentBoard(char[][] A, boolean[][] T)
 {
   
  System.out.println();
  for(int row=0; row<A.length; row++){
   System.out.print((row+1)+"  ");
   for(int col=0; col<A[row].length; col++){    
    if(T[row][col]){
     System.out.print(A[row][col] + "  ");;
    }
    else
    {
     System.out.print('*' + "  ");  
    }
   }
   System.out.println();
  }
 
 
  System.out.print("   ");
  for(int row=0; row<A.length; row++){
   System.out.print((row+1) + "  ");  
  }
    
  System.out.println(); 
  
 }
 
 
 // a method that prints the baord together with the two new locations to be revealed
 public static void printBoardAndTwoNew(char[][] A, boolean[][] T, int r1, int c1, int r2, int c2)
 {
  //printing the board + two new locations
  
  System.out.println();
  for(int row=0; row<A.length; row++){
   System.out.print((row+1)+"  ");
   for(int col=0; col < A[row].length; col++){    
    if(T[row][col] || (row==r1 && col==c1) || (row==r2 && col==c2)){ // print discovered locations and two new locations
     System.out.print(A[row][col] + "  ");;
    }
    else // otherwise print *
    {
     System.out.print('*' + "  ");  
    }
   }
   System.out.println();
  }
 
  System.out.print("   ");
  for(int row=0; row<A.length; row++){
   System.out.print((row+1) + "  ");  
  }
    
  System.out.println();  
 
 }
  
  
 public static void waitForPlayer()
 {
  System.out.print("Press enter to continue");
  try {
   System.in.read();
  }
  catch (IOException e){
   System.out.println("Error reading from user");
  }
 }
  
}

