package KeyListener;

import java.awt.*;
import java.awt.event.*;

public class KeyListener04 extends Frame implements KeyListener {

    private TextField textField;
    private Label displayLabel;
    private StringBuilder arrowBuffer; // StringBuilder to accumulate arrow inputs
    private int keyPressCounter;
    private int maxInputs;

    public KeyListener04(int maxInputs) { // Constructor will take max inputs and String to compare (future version)
        arrowBuffer = new StringBuilder(); // Arrow saver

        keyPressCounter = 0;
        this.maxInputs = maxInputs;

        // Frame
        setTitle("Type Text Display");
        setSize(400, 200);
        setLayout(new FlowLayout());

        textField = new TextField(20);
        textField.addKeyListener(this);
        add(textField);

        displayLabel = new Label("You have typed: ");
        add(displayLabel);

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        setVisible(true);
    }

    // Other methods...

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent pressedKey) {
        int keyCode = pressedKey.getKeyCode();
        System.out.println("You have pressed: " + KeyEvent.getKeyText(keyCode));

        // It is not fucking working >.>
        String text = textField.getText();
        displayLabel.setText("You have typed: " + text);

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
        if (arrowBuffer.length() > 5) {
            System.out.println("All arrows: " + arrowBuffer.toString());
        }
    }

    public static void main (String[] args) {
        new KeyListener04(5);

        /*
        Things to improve in the future:
            - String to compare
            - Exit the method once it is done
            - Limit the kind of inputs you can type or don't count them if
            they are not arrows. Wrong inputs are messing the counter somehow
         */
    }
}
