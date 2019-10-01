import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import javax.swing.SwingUtilities;
import java.awt.Component;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class NURunner
{
    public JFrame a;
    private f a;
    private e a;
    public static boolean a;
    
    private NURunner(final String str, final int n, final int n2, final int n3) {
        this.a = new JFrame(str + " by Selim Temizer");
        this.a = new e(n3, n, n2);
        (this.a = new f(this.a)).add(this.a);
        this.a.setLocationByPlatform(true);
        this.a.setResizable(false);
        this.a.setDefaultCloseOperation(3);
        this.a.pack();
        SwingUtilities.invokeLater(new m(this));
    }
    
    public static void main(final String[] array) {
        final String str = "NU Graduation";
        int int1 = 10;
        int int2 = 1200;
        int int3 = 600;
        System.out.println(str + " by Selim Temizer");
        System.out.println();
        System.out.println("Optional command line arguments: [NumStudents] [WindowWidth] [WindowHeight]");
        System.out.println();
        if (array.length >= 3) {
            int3 = Integer.parseInt(array[2]);
        }
        if (array.length >= 2) {
            int2 = Integer.parseInt(array[1]);
        }
        if (array.length > 0) {
            int1 = Integer.parseInt(array[0]);
        }
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new n());
        System.out.println("Press P to play/pause");
        System.out.println("Press Q to quit");
        System.out.println();
        final NURunner nuRunner = new NURunner(str, int2, int3, int1);
        while (true) {
            if (!NURunner.a) {
                nuRunner.a.a();
                nuRunner.a.repaint();
            }
            Thread.sleep(50L);
        }
    }
    
    static {
        NURunner.a = false;
    }
}
