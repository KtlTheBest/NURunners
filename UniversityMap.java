import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;

public class UniversityMap extends Entity {
    private BufferedImage background;

    public UniversityMap(String something, Vector2D posVector, String pathToBackgroundMap){
        super(name, posVector);
        background = ImageIO.read(new File(pathToBackgroundMap));
    }

    @Override
    public void draw(Graphics2D g2d){
        g2d.drawImage(background, 0, 0, null);
    }
}
