public abstract class Entity {
    public String name;
    public Vector2D position;
    public State state;
    public Common common;

    abstract draw(Graphics2D g2d);

    public void step();

    public draw(Graphics2D g2d);

    // think if you can extend graphics
}
