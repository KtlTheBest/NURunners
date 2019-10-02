public abstract class State {
    public boolean isOver;
    public boolean isVisible;

    public abstract void step(Entity e);

    public abstract String toString();

    public State(){
        isOver = false;
        isVisible = true;
    }

    public State(boolean over, boolean visible){
        isOver = over;
        isVisible = visible;
    }
}
