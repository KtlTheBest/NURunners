import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.KeyEventDispatcher;

// 
// Decompiled by Procyon v0.5.36
// 

final class n implements KeyEventDispatcher
{
    @Override
    public final boolean dispatchKeyEvent(final KeyEvent anEvent) {
        final String string;
        if ((string = KeyStroke.getKeyStrokeForEvent(anEvent).toString()).equals("pressed P")) {
            NURunner.a = !NURunner.a;
            return true;
        }
        if (string.equals("pressed Q")) {
            System.exit(0);
            return true;
        }
        return false;
    }
}
