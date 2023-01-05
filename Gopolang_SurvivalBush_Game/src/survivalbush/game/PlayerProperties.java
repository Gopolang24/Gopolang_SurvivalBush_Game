package survivalbush.game;

/**
 * Player properties class
 * @author Gopolang Mmutlwane
 *
 */

import javafx.scene.PerspectiveCamera;
import survivalbush.controller.Controller;
import survivalbush.controller.Mover;
import survivalbush.entities.Character;
import survivalbush.object2D.Character2D;

public enum PlayerProperties {

    Player1;

    private PerspectiveCamera camera = null;
    private Character character = null;
    private Character2D character2D = null;
    private Controller controller = null;
    private Mover mover = null;

    /**
     * @return camera
     *
     */
    public PerspectiveCamera getCamera() {
        return camera;
    }

    /**
     * @return charactor
     *
     */
    public Character getCharacter() {
        return character;
    }

    /**
     * @return charactor2d
     *
     */
    public Character2D getCharacter2D() {
        return character2D;
    }

    
    /**
     * @return controller
     *
     */
    public Controller getController() {
        return controller;
    }

    /**
     * @return mover
     *
     */
    public Mover getMover() {
        return mover;
    }

    public void setCamera(PerspectiveCamera camera) {
        this.camera = camera;
    }

    /**
     * set Character
     * @param character
     *
     */
    public void setCharacter(Character character) {
        this.character = character;
    }

    /**
     * Set charactor2d
     * @param charactar2D
     * @see Character
     *
     */
    public void setCharacter2D(Character2D character2D) {
        this.character2D = character2D;
    }

    /**
     * set eventhandler/controller
     * @param 
     *       controller
     * @see 
     *     Controller
     */
    public void setController(Controller controller) {
        this.controller = controller;
    }

    /**
     * set player movement
     * @param mover
     * @see Mover
     */
    public void setMover(Mover mover) {
        this.mover = mover;
    }
}
