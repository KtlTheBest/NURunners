import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import javax.swing.SwingUtilities;
import java.awt.Component;
import javax.swing.JFrame;

public class NURunner {
    public JFrame window;
    public Display display;
    public Common common;

    public static boolean paused;

    private NURunner(String projectName, int width, int height, int numOfStudents){
        window = new JFrame(projectName + " by Oracle");
        common = new Common(numOfStudents, width, height);
        display = new Display(common);
        window.add(display);
        window.setLocationByPlatform(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.pack();
        SwingUtilities.invokeLater(new AWTThread(this));
    }

    public static void main(String args[]){
        paused = false;
        String projectName = "NU Graduation";
        int numOfStudents = 10;
        int width = 1200;
        int height = 600;
        System.out.println(projectName + " by Oracle");
        System.out.println();
        // Finish parsing command line arguments System.out.println("")

        if (args.length >= 3) height = Integer.parseInt(args[2]);
        if (args.length >= 3) width = Integer.parseInt(args[1]);
        if (args.length >= 1) numOfStudents = Integer.parseInt(args[0]);

        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(
                new KeyCatcher()// n()
                );
        System.out.println("Press P to play/pause");
        System.out.println("Press Q to quit");
        System.out.println();

        NURunner nuRunner = new NURunner(projectName, width, height, numOfStudents);
        while(true){
            if(!NURunner.paused){
                nuRunner.common.stepAllEntities();
                nuRunner.display.repaint();
            }

            try{
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                System.exit(0);
            }
            
        }
    }
}
