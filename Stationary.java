public class Stationary extends State {
    public Stationary(){
        super(false, true);
    }

    @Override
    public void step(Entity g){
        // empty, don't do anything
    }

    @Override
    public String toString(){
        return "Stationary";
    }
}
