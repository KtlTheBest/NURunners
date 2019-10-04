import java.util.Iterator;

public class Closest extends State {

    int fuel;
    int assignmentsTillNext;

    public Closest(int assignmentsTillNext, int fuel){
        super(false, true);
        this.fuel = fuel;
        this.assignmentsTillNext = assignmentsTillNext;
    }

    @Override
    public void step(Entity e){
        Assessment closest = null;
        double mn = Double.MAX_VALUE;
        for(Assessment assessment : e.common.assessments){
            double dist = e.position.distanceTo(assessment.position);
            if(dist < mn){
                mn = dist;
                closest = assessment;
            }
        }
        if(closest != null){
            if(mn < fuel){
                e.position.set(closest.position);
            } else {
                e.position.add(closest.position.minus(e.position).normalize().scale(fuel));
            }
        }

        if(--assignmentsTillNext <= 0){
            isOver = true;
        }
    }

    @Override
    public String toString(){
        return "Closest";
    }
}
