public abstract class State {
    public bool isOver;
    public bool isVisible;

    abstract step(Entity e);
}
