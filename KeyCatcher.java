import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.KeyEventDispatcher;

public class KeyCatcher implements KeyEventDispatcher {
    @Override
    public boolean dispatchKeyEvent(final KeyEvent event){
        String input;
        input = KeyStroke.getKeyStrokeForEvent(event).toString();
        if(input.equals("pressed P")){
            NURunner.paused = !NURunner.paused;
            return true;
        }
        if(input.equals("pressed Q")){
            System.exit(0);
            return true;
        }
        return false;
    }
}
