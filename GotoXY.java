public class GotoXY extends State {
    private int fuel;
    private Vector2D target;

    public GotoXY(Vector2D target, int fuel){
        super(false, true);
        this.target = target;
        this.fuel = fuel;
    }

    @Override
    public void step(Entity e){
        if(e.position.distanceTo(target) < fuel){
            e.position.set(target);
        } else {
            e.position.add(target.minus(e.position).normalize().scale(fuel));
        }
        if(e.position.distanceTo(target) < 1.0){
            isOver = true;
        }
    }

    @Override
    public String toString(){
        return "GotoXY";
    }
}
