public abstract class State {
    public bool isOver;
    public bool isVisible;

    abstract step(Entity e);

    public State(){
        isOver = false;
        isVisible = true;
    }

    public State(boolean over, boolean visible){
        isOver = over;
        isVisible = visible;
    }
}
