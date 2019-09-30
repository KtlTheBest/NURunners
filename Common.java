import java.util.Random;

public class Common {
    public int windowWidth;
    public int windowHeight;
    public UniversityMap;

    public List <Academician> academicians;
    public List <Speaker> speakers;
    public List <Student> students;
    public List <Assessments> assessments;

    int randomInt(int from, int to){
        Random rand = new Random();
        to = to - from + 1;
        return rand().nextInt(to) + from;
    }

    public stepAllEntities(){
        // I think this one is easy too
    }

    public drawAllEntitites(){
        // Hmm, maybe this is easy too?
    }
}
