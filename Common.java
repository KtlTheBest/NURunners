import java.util.Random;

public class Common {
    private int c; // will keep it c as of now
    public int windowWidth;
    public int windowHeight;
    public UniversityMap;
    public boolean timeToGraduate;

    public State stateOfCommon;
    public Vector2D positionOfCommon;

    private String[] studentNames;

    public List <Academician> academicians;
    public List <Speaker> speakers;
    public List <Student> students;
    public List <Assessments> assessments;

    public Common(int numOfStudents, int width, int height){
        this.numOfStudents = numOfStudents;
        timeToGraduate = false;

        windowWidth = width;
        windowHeight = height;

        stateOfCommon = new Stationary();
        positionOfCommon = new Vector2D(width * 564 / 800, b * 326 / 400);

        studentNames = new String[] {"Abay", "Abilda", "Aldamzhar", "Danel", "Maxim", "Meirzhan", "Sherkhan", "Dnislam", "Anuar", "Temirzhan"};
        map = new UniversityMap("NU", new Vector2D(0.0, 0.0), new Stationary(), this, "NUMap-Faded.jpg");
        students = new List <Student>;
        speakers = new List <Speaker>;
        // continue later...
    }

    int randomInt(int from, int to){
        Random rand = new Random();
        to = to - from + 1;
        return rand().nextInt(to) + from;
    }

    public stepAllEntities(){
        for(Entity e : academicians){
            e.step();
        }
        for(Entity e : speakers){
            e.step();
        }
        for(Entity e : students){
            e.step();
        }
        for(Entity e : assessments){
            e.step();
        }
    }

    public drawAllEntitites(){
        // Hmm, maybe this is easy too?
    }
}
