package CheckerPiece;
import Board.*;
import java.util.*;

public class CheckerPiece {
	
	
	//Enum for the pieces in the game
	enum Piece{
		EMPTY, RED, RED_KING, BLACK, BLACK_KING, OUTSIDE
	}
	//enum CheckerPiece{WHITE, BLACK};
	
	// ChessBoard[][] board = new ChessBoard[8][8]; //to show game status in text based version
	// CheckerPiece[][] board = new CheckerPiece[8][8];
	// ArrayList<CheckerPiece> pieces = new ArrayList<CheckerPiece>(32); //create 32 pieces, 16 for both players
	
	
	// Default constructor.
	public CheckerPiece() {
	}

	// CheckerPiece checker;
	// checker=CheckerPiece.WHITE;
	// checker=CheckerPiece.BLACK;
	
	// for(CheckerPiece chckpc : CheckerPiece.values()){
		// System.out.println(chckpc+" ");
		
	// }
	
	//Used to represent the data of the board
	
		/*
		 * A 2D array representation of the board
		 * The inner array is the x position
		 * The outer array is the y position
		 * 
		 * 	7   B   B   B   B
		 * 	6 B   B   B   B
		 * 	5   B   B   B   B
		 * 	4 
		 * 	3
		 * 	2 R   R   R   R
		 * 	1   R   R   R   R
		 * 	0 R   R   R   R
		 * 	  0 1 2 3 4 5 6 7
		 * 
		 * So board[0][0] is a red piece at the bottom left corner
		 */
		Piece[][] board = new Piece[8][8];
		
		
		
		//Initializes the board with starting set up
		public void init(){
			for (int x = 0; x < 8; x++){
				for (int y = 0; y < 8; y++){
					//Sets red pieces
					if ((y == 0 || y == 2) && x%2 == 0) board[x][y] = Piece.RED;
					else if (y == 1 && x%2 == 1) board[x][y] = Piece.RED;
					//Sets black pieces
					else if ((y == 5 || y == 7) && x%2 == 1) board[x][y] = Piece.BLACK;
					else if (y == 6 && x%2 == 0) board[x][y] = Piece.BLACK;
					//Sets empty spots
					else if ((y == 4 && x%2 == 0) || (y == 3 && x%2 == 1)) board[x][y] = Piece.EMPTY;
					//Sets remainder of board to outside the playable area
					else board[x][y] = Piece.OUTSIDE;
				}
			}
		}
		
		//Initializes a board as an empty board -- mainly used for testing
		public void initEmpty(){
			for (int x = 0; x < 8; x++)
				for (int y = 0; y < 8; y++)
					if (y%2 == x%2)
						board[x][y] = Piece.EMPTY;
		}
		
		//Assigns the specific spots to specific pieces -- used for testing
		public void test(){
			board[2][2] = Piece.RED;
			board[3][3] = Piece.BLACK;
			board[3][5] = Piece.BLACK;
		}
	
		public Board clone(){
			Board cloneBoard = new Board();
			for (int x = 0; x < 8; x++){
				for (int y = 0; y < 8; y++){
					cloneBoard.setPiece(x, y, board[x][y]);
				}
			}
			
			return cloneBoard;
		}
		
		//Clone constructor
		public Board(Board inBoard){
			for (int x = 0; x < 8; x++){
				for (int y = 0; y < 8; y++){
					board[x][y] = inBoard.getPiece(x, y);
				}
			}
		}
		
		//Returns the piece at the specified coordinate
		public Piece getPiece(int x, int y){
			return board[x][y];
		}
		
		//Sets the spot at the coordinates to the specified piece
		public void setPiece(int x, int y, Piece inPiece){
			board[x][y] = inPiece;
		}

	
	
	/**
	//?????
	for (int i=0; i<8; i++) { 
		// constructor
		pieces.add(new CheckerPiece("B", "P", i, 1)); //black pawns to 2nd row 
		pieces.add(new CheckerPiece("W", "P", i, 6)); //white pawns to 7 row
			}
	
		
	//
	Create piece objects and populate the board with them.
	 //
	public void initBoard() {
	//	emptyBoard(); //removes the board from pieces
		createPieces(); //creates piece objects
	//	populateBoard(); //populates the board with piece objects
	}
	
	**/
	
	
	
	
	
		
	// Get all pieces as an arraylist.
	public ArrayList<CheckerPiece> getPieces() {
		return pieces;
	}
	
	// Set arraylist wich contains all pieces.
	 
	public void setPieces(ArrayList<CheckerPiece> pieces) {
		this.pieces = pieces;
	}

	// prints all the elements available in list  - BUT USED ONLY for ARRAYS!!!
	public void printList() {
	for (CheckerPiece piece : pieces) { 
		
			String print = piece.printInfo();
            System.out.println(" " + print + " ");  
        }
	}		
	
}