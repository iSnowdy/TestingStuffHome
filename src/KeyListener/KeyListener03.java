package KeyListener;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;


public class KeyListener03 extends Frame implements KeyListener {

    private TextField textField;
    private Label displayLabel;

    public KeyListener03() {
        // Frame
        setTitle("Type Text Display");
        setSize(400, 200);
        setLayout(new FlowLayout());

        // We add the text field for inputs from the user

        textField = new TextField(20);
        textField.addKeyListener(this);
        add(textField);

        // Creation of the label to display the text
        displayLabel = new Label("You have typed: ");
        add(displayLabel);

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        setVisible(true);
    }

    // We now implement the methods

    // First of all the pressing of the key

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent pressedKey) {}

    // Then the release
    @Override
    public void keyReleased(KeyEvent releasedKey) {
        int keyCode = releasedKey.getKeyCode();
        System.out.println("Key released: " + KeyEvent.getKeyText(keyCode));

        String tests = textField.getText();
        String[] wholeThing = tests.split("");
        System.out.println("Works? " + tests);
        System.out.println("A? " + Arrays.toString(wholeThing));



        int length = 10;
        // In the future this will vary depending on the length of the arrow input asked to do
        String arrowsInput;
        StringBuilder bufferString = new StringBuilder();

        /*
        for (int i = 0; i < length; i ++) {
            if (releasedKey.getKeyCode() == KeyEvent.VK_UP) {
                bufferString.append("↑ ");
            }
            else if (releasedKey.getKeyCode() == KeyEvent.VK_RIGHT) {
                bufferString.append("→ ");
            }
            else if (releasedKey.getKeyCode() == KeyEvent.VK_DOWN) {
                bufferString.append("↓ ");
            }
            else if (releasedKey.getKeyCode() == KeyEvent.VK_LEFT) {
                bufferString.append("← ");
            }
        }
            System.out.println("All arrows: " + bufferString.toString());
        }
        */

        if (releasedKey.getKeyCode() == KeyEvent.VK_UP) {
            bufferString.append("↑ ");
        } else if (releasedKey.getKeyCode() == KeyEvent.VK_RIGHT) {
            bufferString.append("→ ");
        } else if (releasedKey.getKeyCode() == KeyEvent.VK_DOWN) {
            bufferString.append("↓ ");
        } else if (releasedKey.getKeyCode() == KeyEvent.VK_LEFT) {
            bufferString.append("← ");
        }

        System.out.println("All arrows: " + bufferString.toString());

        // For now it only saves one arrow at a time. However, if we implement a method that receives
        // a StringBuilder as a parameter, it should work

    }

    // Although we do not use the methods above, they must be declared because of interface/abstraction
    // And finally the output

    public static void main (String[] args) {
        new KeyListener03();
    }
}
