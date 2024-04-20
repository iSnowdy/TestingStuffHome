package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class KeyListener05 extends JFrame implements KeyListener {

    private TextField textField;
    private JLabel displayLabel;
    private StringBuilder arrowBuffer; // StringBuilder to accumulate arrow inputs
    private int keyPressCounter;
    private int maxInputs;

    public KeyListener05(int maxInputs) { // Constructor will take max inputs and String to compare (future version)
        arrowBuffer = new StringBuilder(); // Arrow saver

        keyPressCounter = 0;
        this.maxInputs = maxInputs;

        // JFrame
        setTitle("ARROW MINIGAME");
        setSize(600, 200);
        setLayout(new FlowLayout());

        setBackground(Color.white); // BG color of the frame
        Font font = new Font("SansSerif", Font.BOLD, 16);

        textField = new TextField(40);
        textField.addKeyListener(this);
        textField.setBackground(Color.ORANGE);
        textField.setFont(font);
        add(textField);

        // This label in the future will be the arrow inputs that the user must type
        // Problem: the String must be in UNICODE KEKW
        // Fonts are an issue
        // It was the Frame class... outdated. JLabel was the answer ><

        Font labelFont = new Font("DejaVu Sans", Font.PLAIN, 20);
        String labelText = new String("→ ↑ ↓ ↓ ↑ → ↑ ↑ ↑ → → → ↓ ← ↓ ↑ ↑ ↓ ↓ ←");
        displayLabel = new JLabel(labelText);
        displayLabel.setFont(labelFont);
        add(displayLabel);
        //System.out.println(Arrays.toString(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames()));
        System.out.println(displayLabel.getFont().getFontName());

        // I don't know how to fix this. So instead make a switch so it recognizes the arrows
        // and prints them in UNICODE. Since individual arrow are recognized

        setFocusable(true); // Permits user's inputs
        setFocusTraversalKeysEnabled(false);
        setVisible(true);
        setLocationRelativeTo(null); // Position of the window pop up
    }

    // Other methods...

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent pressedKey) {
        int keyCode = pressedKey.getKeyCode();

        if (    keyCode == KeyEvent.VK_UP ||
                keyCode == KeyEvent.VK_DOWN ||
                keyCode == KeyEvent.VK_RIGHT ||
                keyCode == KeyEvent.VK_LEFT) {
            System.out.println("You have pressed: " + KeyEvent.getKeyText(keyCode));
        } // Only key inputs will be printed


        // To show the inputs on the text field
        textField.setText(textField.getText() + KeyEvent.getKeyText(keyCode));

        // Append arrow input to the buffer if an arrow key is pressed
        appendArrowInput(pressedKey.getKeyCode());
        keyPressCounter ++;
        if (keyPressCounter >= maxInputs) processArrowInputs();
    }

    // Like this we identify if an arrow is pressed. If it is, then it will be saved
    private void appendArrowInput(int keyCode) {
        if (keyCode == KeyEvent.VK_UP) {
            arrowBuffer.append("↑ ");
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            arrowBuffer.append("→ ");
        } else if (keyCode == KeyEvent.VK_DOWN) {
            arrowBuffer.append("↓ ");
        } else if (keyCode == KeyEvent.VK_LEFT) {
            arrowBuffer.append("← ");
        }
    }

    // Print the thingy
    public void processArrowInputs() {
        if (arrowBuffer.length() > maxInputs) {
            System.out.println("All arrows: " + arrowBuffer.toString());
            keyPressCounter = 0;
            arrowBuffer.setLength(0);
            dispose(); // In the future also implements this dispose to close the window once the timer is done
            // Like this every time it reaches the desired length, it will reset
        }
    }

    public static void main (String[] args) {
        new KeyListener05(5);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); so when pressing X it closes. Future implementation

        /*
        Things to improve in the future:
            - String to compare
            - Limit the kind of inputs you can type or don't count them if
            they are not arrows. Wrong inputs are messing the counter somehow
         */
    }
}
