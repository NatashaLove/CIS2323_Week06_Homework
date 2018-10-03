package Board;
import java.util.*;
import CheckerPiece.*;


//Make board and its rules separate and chess pieces - separate

public class Board {
	
	//global variables
	// row and column for position on the board
	private int column; 
	private int row;
	
	//CheckerPiece[][] board = new CheckerPiece[8][8]; = массив 8х8 - шахматная доска 64 клетки- элементы массива - клетки доски, в которых есть (или нет) фигуры
	CheckerPiece[][] board = new CheckerPiece[8][8];

	//как проверить клетку в i-й строке, j-й колонке? CheckerPiece cp = board[i][j]; 
	//как поставить шашку в i-ю строку, j-ю колонку? board[i][j] = cp;	
	
	// ChessPiece[][] board = new ChessPiece[8][8];
	// ArrayList<ChessPiece> pieces = new ArrayList<ChessPiece>(32); //create 32 pieces, 16 for both players
	//Piece piece = new Piece();
	//Enum for the pieces in the game
	// enum Piece{
		// EMPTY, RED, RED_KING, BLACK, BLACK_KING, OUTSIDE
	// }
	
//	CheckerPiece piece;


	// // Default constructor.
	public Board() {
	}
	
	//Clone constructor
		public Board(Board inBoard){
			for (int x = 0; x < 8; x++){
				for (int y = 0; y < 8; y++){
					board[x][y] = inBoard.getPiece(x, y);
				}
			}
		}
	
	// // Constructor.
	// public ChessBoard() {
		// initBoard(); //places pieces on the board 
	// }


		
		// CheckerPiece checker;
	// checker=CheckerPiece.RED;
	// checker=CheckerPiece.BLACK;
		
	/*
	 Shows the current game state which is 8x8 board with pieces on it.
	 Shows notation on each side.
	 */
	 
	 //Print the board to the terminal
	public void printBoard(){
		for (int y = 7; y >= 0 ; y--){
			System.out.print("" + y + " ");
			for (int x = 0; x < 8; x++){
				//if (board[x][y] == Piece.RED_KING) System.out.print("R ");
				//else if (board[x][y] == Piece.BLACK_KING) System.out.print("B ");
				//else 
				if (board[x][y] == Piece.RED) System.out.print("r ");
				else if (board[x][y] == Piece.BLACK) System.out.print("b ");
				else System.out.print("  ");
			}
			System.out.println();	
		}
		System.out.println("  0 1 2 3 4 5 6 7");
	}
	 
	 
	 /**
	 *Do I need it here?----------
	 *????????????????????????????
	 
	 
	 //Used to represent the data of the board
	private class Board implements Cloneable{
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
		 //
		 
		 
		Piece[][] board = new Piece[8][8];
		
		//Default empty constructor 
		public Board(){	
		}
		
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
		
		//Print the board to the terminal
		public void printBoard(){
			for (int y = 7; y >= 0 ; y--){
				System.out.print("" + y + " ");
				for (int x = 0; x < 8; x++){
					if (board[x][y] == Piece.RED_KING) System.out.print("R ");
					else if (board[x][y] == Piece.BLACK_KING) System.out.print("B ");
					else if (board[x][y] == Piece.RED) System.out.print("r ");
					else if (board[x][y] == Piece.BLACK) System.out.print("b ");
					else System.out.print("  ");
				}
				System.out.println();	
			}
			System.out.println("  0 1 2 3 4 5 6 7");
		}
}
	 
	 
	 */
	 
	// public void showGameStateWithNotation() {
		// System.out.println();
		// System.out.println("     a  b  c  d  e  f  g  h"); //alphabetic notation
		// System.out.println("  ###########################");
		// for (int i=0; i<=7; i++) { //rows
			// System.out.print(8-i+" #|"); //all rows begin with a divider
			// for (int j=0; j<=7; j++) { //columns
				// if (board[i][j] == null) { //if empty square
					// System.out.print("  "); //print empty string
					// System.out.print("|"); //print divider
				// } else {
					// // System.out.print(board[i][j].getRowAcronym()); //print acronym
					// // System.out.print("|"); //print divider
				// }
			// }
			// System.out.println("# " +(8-i)); //next row
			// if (i!=7) {
				// System.out.println("  #|-----------------------|#"); //linebreak between rows
			// }
		// }
		// System.out.println("  ###########################");
		// System.out.println("     a  b  c  d  e  f  g  h"); //alphabetic notation
		// System.out.println();
	// }
	
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