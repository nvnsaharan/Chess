
public class ChessGame {
  public String chessboard[][] = new String[8][8];

  public ChessGame() {
    initializeGame();
  }

  public void makeMove(String pos){
    System.out.println(chessboard[(int) pos.charAt(0)][(int) pos.charAt(1)] + " "+ chessboard[(int) pos.charAt(2)][(int) pos.charAt(3)]);
  }

  private void initializeGame(){
    // Pieces for the top (black) side of the board
    chessboard[0][0] = "BR";
    chessboard[0][1] = "BN";
    chessboard[0][2] = "BB";
    chessboard[0][3] = "BQ";
    chessboard[0][4] = "BK";
    chessboard[0][5] = "BB";
    chessboard[0][6] = "BN";
    chessboard[0][7] = "BR";

    // Pawns for the top (black) side of the board
    for (int j = 0; j < 8; j++) {
        chessboard[1][j] = "BP";
    }

    // Empty spaces in the middle of the board
    for (int i = 2; i < 6; i++) {
      for (int j = 0; j < 8; j++) {
          chessboard[i][j] = "";
      }
    }

    // Pieces for the bottom (white) side of the board
    chessboard[7][0] = "WR";
    chessboard[7][1] = "WN";
    chessboard[7][2] = "WB";
    chessboard[7][3] = "WQ";
    chessboard[7][4] = "WK";
    chessboard[7][5] = "WB";
    chessboard[7][6] = "WN";
    chessboard[7][7] = "WR";

    // Pawns for the bottom (white) side of the board
    for (int j = 0; j < 8; j++) {
        chessboard[6][j] = "WP";
    }
  }
}
