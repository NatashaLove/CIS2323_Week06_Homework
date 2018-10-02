package CheckerPiece;

public class CheckerPiece {
	
	// row and column for position on the board
	private int column; 
	private int row;
	
	enum Checkers{WHITE, BLACK};
	

	//global variables
	 
	// ChessBoard[][] board = new ChessBoard[8][8]; //to show game status in text based version
	CheckerPiece[][] board = new CheckerPiece[8][8];
	ArrayList<CheckerPiece> pieces = new ArrayList<CheckerPiece>(32); //create 32 pieces, 16 for both players
	
	
	// Default constructor.
	public CheckerPiece() {
	}

		
	// Default constructor.
	// public ChessBoard() {
	// }
	// Constructor.
	public Board() {
		initBoard(); //places pieces on the board 
	}
	
		
	/*
	Create piece objects and populate the board with them.
	 */
	public void initBoard() {
	//	emptyBoard(); //removes the board from pieces
		createPieces(); //creates piece objects
	//	populateBoard(); //populates the board with piece objects
	}
	
		
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