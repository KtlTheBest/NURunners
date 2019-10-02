public class Rest extends State {
    private int restCounter;

    public Rest(int n){
        super(false, true);
        restCounter = n;
    }

    @Override
    public void step(Entity e){
        restCounter -= 1;
        if(restCounter <= 0){
            isOver = true;
        }
    }

    @Override
    public String toString(){
        return "Rest";
    }
}
