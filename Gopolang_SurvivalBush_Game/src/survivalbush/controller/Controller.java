package survivalbush.controller;


import javafx.scene.Scene;

import java.util.ArrayList;

/**
 * Class resposible for controls/ eventhandling.
 * @author Gopolang Mmutlwane
 *
 */
public class Controller {

    private ArrayList<String> input;
    private boolean disabled = false;

    /**
     * Constructor
     * @param scene
     */
    public Controller(Scene scene) {

        input = new ArrayList<>();

        scene.setOnKeyPressed(e -> {
            System.out.println("Pressed " + e.getCode().toString());
            String keyCode = e.getCode().toString();
            if (!disabled && !input.contains(keyCode))
                input.add(keyCode);

        });

        scene.setOnKeyReleased(e -> {
            System.out.println("Released " + e.getCode().toString());
            String keyCode = e.getCode().toString();
            if (input.contains(keyCode))
                input.remove(keyCode);

        });
    }

    /**
     * Responsible for inputs from the user
     * @return input
     */

    public ArrayList<String> getInputs() {
        return input;
    }

    public void setDisabled(boolean b) {
        this.disabled = b;
    }

    public boolean isDisabled() {
        return disabled;
    }

}
