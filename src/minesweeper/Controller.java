package minesweeper;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author FIS-12 (ryanstekken93 // JH)
 */
public class Controller extends MouseAdapter {

    private Field field;
    private Model model;

    /** @param field bezeichnet das Spielfeld
     *
     */

    public Controller(Field field) {
        this.field = field;
    }

    /**
     * für Änderungen des Typs field (Spielfeld)
     */
    public void updateField(Field field) {
        this.field = field;
    }

    /**
     * Konstruktor
     *
     * @param model
     */
    public Controller(Model model) {
        this.model = model;
    }
    
    /**
     * Sucht nach Mausklicks innerhalb des Spielfelds
     * class the Method in the model
     *
     * @param e the MouseEvent welches gerade passiert, wird überschrieben!
     */

    @Override
    public void mouseClicked(MouseEvent e) {

        switch (e.getButton()) {
            case MouseEvent.BUTTON1:
                if (this.model == null) {
                    if (!field.isFlag()) {
                        field.reveal();

                    }
                } else {
                    model.Init();
                }
                break;
            case MouseEvent.BUTTON3:
                if (this.model == null) {
                    field.changeState();
                }
                break;
            default:
                break;
        }
    }
}
