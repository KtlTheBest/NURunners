import java.util.Iterator;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Common {
    private int numOfStudents;
    public int windowWidth;
    public int windowHeight;
    public UniversityMap map;
    public boolean timeToGraduate;

    public State state;
    public Vector2D position;

    private String[] studentNames;

    public List <Academician> academicians;
    public List <Speaker> speakers;
    public List <Student> students;
    public List <Assessment> assessments;

    public Common(int numOfStudents, int width, int height){
        this.numOfStudents = numOfStudents;
        timeToGraduate = false;

        windowWidth = width;
        windowHeight = height;

        state = new Stationary();
        position = new Vector2D(windowWidth * 564 / 800, windowHeight * 326 / 400);

        studentNames = new String[] {"Abay", "Abilda", "Aldamzhar", "Danel", "Maxim", "Meirzhan", "Sherkhan", "Dnislam", "Anuar", "Temirzhan"};
        map = new UniversityMap("NU", new Vector2D(0.0, 0.0), new Stationary(), this, "NUMap-Faded.jpg");
        students = new List <Student>();
        speakers = new List <Speaker>();
        // continue later...
    }

    private int randomInt(int from, int to){
        Random rand = new Random();
        to = to - from + 1;
        return rand.nextInt(to) + from;
    }

    private Vector2D randomDirection(){
        return new Vector2D(randomInt(-20, 20), randomInt(-20, 20));
    }

    private Vector2D randomPositionFromBorder(int border){
        int nX = randomInt(border, windowWidth - border);
        int nY = randomInt(border, windowHeight - border);
        return new Vector2D(nX, nY);
    }

    private State getRandomStudentState(){
        int randInt = this.randomInt(1, 4);
        switch(randInt){
            case 1: {
                return new Rest(randomInt(30, 50));
            }
            case 2: {
                return new ZigZag(randomInt(30, 50), randomDirection(), randomInt(2, 5));
            }
            case 3: {
                return new GotoXY(randomPositionFromBorder(1), randomInt(2, 5));
            }
            case 4: {
                return new Closest(randomInt(30, 50), randomInt(2, 5));
            }
        }
    }

    public void stepAllEntities(){
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

}
