public class Vector2D {
    double x;
    double y;

    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector2D(Vector2D v){
        this.x = v.x;
        this.y = v.y;
    }

    public void set(Vector2D v){
        this.x = v.x;
        this.y = v.y;
    }

    public void add(Vector2D v){
        this.x += v.x;
        this.y += v.y;
    }

    public double distanceTo(Vector2D other){
        return Math.sqrt((other.x - this.x) * (other.x - this.x) + (other.y - this.y) * (other.y - this.y));
    }

    public Vector2D normalize(){
        double distance = distanceTo(new Vector(0, 0));
        double newX = x / distance;
        double newY = y / distance;
        Vector2D v = new Vector2D(newX, newY);
        return v;
    }

    public Vector2D plus(Vector2D other){
        double newX = this.x + other.x;
        double newY = this.y + other.y;
        return new Vector2D(newX, newY);
    }
    
    public Vector2D minus(Vector2D other){
        double newX = this.x - other.x;
        double newY = this.y - other.y;
        return new Vector2D(newX, newY);
    }

    public Vector2D scale(int rate){
        return new Vector2D(this.x * rate, this.y * rate);
    }
}
