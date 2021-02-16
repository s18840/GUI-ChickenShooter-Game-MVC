import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()-> new Main()
        );

    }
    public Main(){
        // MENU POCZĄTKOWE
        JFrame menuGlowne = new JFrame("Chicken Shooter");
        menuGlowne.setSize(120,240);
        JPanel panelGlowny = new JPanel();
        JButton newGame = new JButton("New Game");
        JButton highScores = new JButton("High Scores");
        JButton exit = new JButton("Exit");
        int difficultyLevel;

        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("New Game");
                menuGlowne.setVisible(false);
                JFrame gameLevel = new JFrame();
                JLabel jLabelLevel = new JLabel("Set difficulty level");
                newGame.setSize(100,100);
                JPanel panelNewGame = new JPanel();
                JButton easy = new JButton("EASY");
                JButton medium = new JButton("MEDIUM");
                JButton hard = new JButton("HARD");
                panelNewGame.add(jLabelLevel);
                panelNewGame.add(easy);
                panelNewGame.add(medium);
                panelNewGame.add(hard);
                gameLevel.add(panelNewGame);
                gameLevel.pack();
                gameLevel.setLocationRelativeTo(null);
                gameLevel.setVisible(true);

                easy.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        difficultyLevel =1;

                    }
                });

                medium.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int difficultyLevel =2;
                    }
                });

                hard.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int difficultyLevel =3;
                    }
                });

            }
        });
        highScores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("High Scores");
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit");
            }
        });
        panelGlowny.add(newGame);
        panelGlowny.add(highScores);
        panelGlowny.add(exit);
        menuGlowne.add(panelGlowny);
        menuGlowne.pack();
        menuGlowne.setLocationRelativeTo(null);
        menuGlowne.setVisible(true);
        menuGlowne.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
