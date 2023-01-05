package survivalbush.state;

/**
 * serves as the template of other game states or rooms
 * @author Gopolang Mmutlwane
 */

public interface IState {

    void init();

    void onEnter();

    void update(long currentTime);

    void draw();

    void onExit();

    void onClose();

}
