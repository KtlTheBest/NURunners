public class ZigZag extends State {
    private int fuel;
    private int duration;
    Vector2D direction;

    public ZigZag(int duration, Vector2D direction, int fuel){
        super(false, true);
        this.duration = duration;
        this.fuel = fuel;
        this.direction = direction;
    }

    @Override
    public void step(Entity e){
        e.position.add(direction.scale(fuel));
        if(e.position.x <= 0.0 || e.position.x >= e.common.windowWidth){
            direction.x *= -1;
        }
        if(e.position.y <= 0.0 || e.position.y >= e.common.windowHeight){
            direction.y *= -1;
        }
        if(--duration <= 0){
            isOver = true;
        }
    }

    @Override
    public String toString(){
        return "ZigZag";
    }
}
