package Board;
import java.util.*;
import CheckerPiece.*;

//Make board and its rules separate and chess pieces - separate

public class ChessBoard {
	
	// //global variables
	 
	// // ChessBoard[][] board = new ChessBoard[8][8]; //to show game status in text based version
	// ChessPiece[][] board = new ChessPiece[8][8];
	// ArrayList<ChessPiece> pieces = new ArrayList<ChessPiece>(32); //create 32 pieces, 16 for both players
	
	// // Default constructor.
	public ChessBoard() {
	}
	// // Constructor.
	// public ChessBoard() {
		// initBoard(); //places pieces on the board 
	// }
	
	/*
	 Shows the current game state which is 8x8 board with pieces on it.
	 Shows notation on each side.
	 */
	public void showGameStateWithNotation() {
		System.out.println();
		System.out.println("     a  b  c  d  e  f  g  h"); //alphabetic notation
		System.out.println("  ###########################");
		for (int i=0; i<=7; i++) { //rows
			System.out.print(8-i+" #|"); //all rows begin with a divider
			for (int j=0; j<=7; j++) { //columns
				if (board[i][j] == null) { //if empty square
					System.out.print("  "); //print empty string
					System.out.print("|"); //print divider
				} else {
					// System.out.print(board[i][j].getRowAcronym()); //print acronym
					// System.out.print("|"); //print divider
				}
			}
			System.out.println("# " +(8-i)); //next row
			if (i!=7) {
				System.out.println("  #|-----------------------|#"); //linebreak between rows
			}
		}
		System.out.println("  ###########################");
		System.out.println("     a  b  c  d  e  f  g  h"); //alphabetic notation
		System.out.println();
	}
	
	/*
	Create piece objects and populate the board with them.
	 */
	// public void initBoard() {
	// //	emptyBoard(); //removes the board from pieces
		// createPieces(); //creates piece objects
	// //	populateBoard(); //populates the board with piece objects
	// }
	
		
	// // Get all pieces as an arraylist.
	// public ArrayList<ChessPiece> getPieces() {
		// return pieces;
	// }
	
	// // Set arraylist wich contains all pieces.
	 
	// public void setPieces(ArrayList<ChessPiece> pieces) {
		// this.pieces = pieces;
	// }

	// // prints all the elements available in list  - BUT USED ONLY for ARRAYS!!!
	// public void printList() {
	// for (ChessPiece piece : pieces) { 
		
			// String print = piece.printInfo();
            // System.out.println(" " + print + " ");  
        // }
	// }		
	
	
}