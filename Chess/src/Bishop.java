import java.io.IOException;

public class Bishop extends Piece{
	public Bishop(boolean isWhite, int row, int column) throws IOException {
		super(isWhite,row,column,isWhite ? "bishop_white.png" : "bishop_black.png");
	}
}
