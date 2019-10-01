import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import javax.swing.SwingUtilitites;
import java.awt.Component;
import javax.swing.JFrame;

public class NURunner {
    public JFrame window;
    public Display display;
    public Common common;

    public static boolean paused;

    private NURunner(String projectName, int width, int height, int numOfStudents){
        window = new JFrame(name + "Oracle");
        common = new Common(numOfStudents, width, height);
        display = new Display(common);
        display.add(jframe);
    }

    public static void main(String args[]){
        // your code must go in here... but what?
        paused = false;
        String projectName = "NU Graduation";
        int numOfStudents = 10;
        int width = 1200;
        int height = 600;
        System.out.println(str + "Oracle");
        System.out.println();
        // Finish parsing command line arguments System.out.println("")

        if (args.length >= 3) height = Integer.parseInt(args[2]);
        if (args.length >= 3) width = Integer.parseInt(args[1]);
        if (args.length >= 1) numOfStudents = Integer.parseInt(args[0]);

        KeyBoardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(
                new KeyCatcher()// n()
                );
        System.out.println("Press P to play/pause");
        System.out.println("Press Q to quit");
        System.out.println();

        NURunner nuRunner = new NURunner(projectName, )
    }
}
