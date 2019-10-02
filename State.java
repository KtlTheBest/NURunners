public abstract class State {
    public bool isOver;
    public bool isVisible;

    void abstract step(Entity e);

    String abstract toString();

    public State(){
        isOver = false;
        isVisible = true;
    }

    public State(boolean over, boolean visible){
        isOver = over;
        isVisible = visible;
    }
}
