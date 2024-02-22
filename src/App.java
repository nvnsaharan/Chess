public class App {
  public static void main(String[] args) {
    ChessGame chessgame = new ChessGame();
    ChessGUI chessgui = new ChessGUI(chessgame.chessboard);
    
    String oldSelectedPositions = chessgui.selectedPositions;

    if (!oldSelectedPositions.equals(chessgui.selectedPositions)) {
      if(chessgui.selectedPositions.length() == 4){
        System.out.println(chessgui.selectedPositions);
        oldSelectedPositions = "";
      }
    } else {
      oldSelectedPositions = chessgui.selectedPositions;
    }

     
  }
}
