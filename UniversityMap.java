import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class UniversityMap extends Entity {
    private BufferedImage background;

    public UniversityMap(String name, Vector2D position, State state, Common common, String pathToBackgroundMap){
        super(name, position, state, common);
        try{
            background = ImageIO.read(new File(pathToBackgroundMap));
        } catch (IOException e) {

        }
    }

    @Override
    public void draw(Graphics2D g2d){
        g2d.drawImage(background, 0, 0, null);
    }
}
