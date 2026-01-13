package chess.components;

import javax.swing.*;
import java.awt.*;

// TODO: make it scale base on the monitor's width
// TODO: make it compatible with full screen mode
// TODO: learn Swing

public class GameFrame extends JFrame {
    public void loadUI() {
        this.setTitle("Chess Game 2.0");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1000, 800));
        this.pack();
    }
}
