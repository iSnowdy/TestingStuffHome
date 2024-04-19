package KeyListener;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;


public class ImprovedListener extends Frame implements KeyListener {

    private TextField textField;
    private Label displayLabel;

    public ImprovedListener() {
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
    public void keyPressed(KeyEvent pressedKey) {
        int keyCode = pressedKey.getKeyCode();
        System.out.println("You have pressed: " + KeyEvent.getKeyText(keyCode));
    }

    // Then the release
    @Override
    public void keyReleased(KeyEvent releasedKey) {
        int keyCode = releasedKey.getKeyCode();
        System.out.println("Key released: " + KeyEvent.getKeyText(keyCode));

        String tests = textField.getText();
        String[] wholeThing = tests.split("");
        System.out.println("Works? " + tests);
        System.out.println("A? " + Arrays.toString(wholeThing));

        if (releasedKey.getKeyCode() == KeyEvent.VK_UP ||
            releasedKey.getKeyCode() == KeyEvent.VK_RIGHT ||
            releasedKey.getKeyCode() == KeyEvent.VK_DOWN ||
            releasedKey.getKeyCode() == KeyEvent.VK_LEFT) {
            String arrows = String.valueOf(KeyEvent.VK_UP);
            String[] allArrows = arrows.split("");
            System.out.println("Arrow " + arrows);
            System.out.println("All arrows: " + Arrays.toString(allArrows));
        }
    }

    // Although we do not use the methods above, they must be declared because of interface/abstraction
    // And finally the output
    @Override
    public void keyTyped(KeyEvent outputKey) {
        // char keyChar = outputKey.getKeyChar();
        // System.out.println("Key typed: " + keyChar);
        // displayLabel.setText("Typed input: " + textField.getText() + keyChar);

    }

    public static void main (String[] args) {
        new ImprovedListener();
    }
}
