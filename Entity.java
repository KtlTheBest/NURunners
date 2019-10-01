import java.awt.*;

public abstract class Entity {
    public String name;
    public Vector2D position;
    public State state;
    public Common common;

    public abstract draw(Graphics2D g2d);

    public void step(){
        state.step();
    }

    public draw(Graphics2D g2d);

    // think if you can extend graphics
}
