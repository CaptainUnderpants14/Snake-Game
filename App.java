import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int frameWidth = 600;
        int frameHeight = 600;

        JFrame frame = new JFrame("Snake Game");
        frame.setVisible(true);
	    frame.setSize(frameWidth, frameHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(frameWidth, frameHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
         
    }
}
