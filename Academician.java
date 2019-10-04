import java.awt.geom.AffineTransform;
import java.awt.FontMetrics;
import java.awt.Paint;
import java.awt.Color;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Font;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Academician extends Entity {
    private int imageWidth;
    private int imageHeight;
    private BufferedImage image;

    public Academician(String name, Vector2D position, State state, Common common, String pathToImage){
        super(name, position, state, common);
        try{
            image = ImageIO.read(new File(pathToImage));
        } catch (IOException e){

        }
        imageWidth = image.getWidth() / 4;
        imageHeight = image.getHeight() / 4;
    }

    @Override
    public void draw(Graphics2D g2d){
        Font font = g2d.getFont();
        g2d.setFont(new Font("Sans Serif", 1, 14));
        FontMetrics fontMetrics = g2d.getFontMetrics();
        AffineTransform transform = g2d.getTransform();
        g2d.translate((int)position.x, (int)position.y);
        g2d.drawImage(image, -imageWidth / 2, -imageHeight / 2, imageWidth, imageHeight, null);
        g2d.setPaint(Color.BLACK);
        g2d.drawString(name, (int)(-fontMetrics.stringWidth(name) / 2.0) + 1, -imageHeight / 2 - 2);
        String stateName = state.toString();
        g2d.drawString(stateName, (int)(-fontMetrics.stringWidth(stateName) / 2.0) + 1, imageHeight / 2 + 12);
        g2d.setTransform(transform);
        g2d.setFont(font);
    }
}
