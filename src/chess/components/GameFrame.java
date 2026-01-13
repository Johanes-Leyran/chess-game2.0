package chess.components;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public void loadUI() {
        this.setTitle("Chess Game 2.0");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1000, 700));
        this.pack();
    }
}
