import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChessGUI {
    private JFrame frame = new JFrame("Chess Game");
    private JButton[][] board = new JButton[8][8];
    private JPanel panel = new JPanel(new GridLayout(8,8));
    public String selectedPositions = "";

    public ChessGUI(String[][] chessboard){
        renderUI(chessboard);
    }

    public void renderUI(String[][] chessboard) {
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                ImageIcon image = new ImageIcon("/Users/naveen.saharan/Desktop/Code/Chess/resources/" + chessboard[i][j]+ ".png");
                Image scaledImage = image.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(scaledImage);

                board[i][j] = new JButton(null, resizedIcon);
                board[i][j].setOpaque(true);
                board[i][j].setBorderPainted(false);
                board[i][j].setBorder(null);
                board[i][j].setFocusable(false);

                final int row = i;
                final int col = j;

                board[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        handleButtonClick(chessboard[row][col], row, col);
                    }
                });

                if ((i+j) % 2 == 0){
                    board[i][j].setBackground(Color.white);
                } else {
                    board[i][j].setBackground(Color.gray);
                }
                panel.add(board[i][j]);
            }
        }

        frame.add(panel);
        frame.setVisible(true);
    }  

    private void handleButtonClick(String piece, int row, int col) {
        if (piece.length() != 0){
            selectedPositions += row +""+col;      
            System.out.println(selectedPositions + " "+ piece);
        } else if(selectedPositions.length() != 0){
            selectedPositions += row +""+col;
            System.out.println("here");
        }

        if(selectedPositions.length() == 4){
            selectedPositions = "";
        }
    }
}