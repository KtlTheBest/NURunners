import java.util.Iterator;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Common {
    private int numOfStudents;
    public int windowWidth;
    public int windowHeight;
    public UniversityMap map;
    public boolean graduated;

    public State state;
    public Vector2D amphitheater;

    private String[] studentNames;

    public List <Academician> academicians;
    public List <Speaker> speakers;
    public List <Student> students;
    public List <Assessment> assessments;
    public List <AssessmentFactory> assessmentFactoryList;

    private Random randomizer;

    public Common(int numOfStudents, int width, int height){
        this.numOfStudents = numOfStudents;
        graduated = false;

        windowWidth = width;
        windowHeight = height;

        state = new Stationary();
        amphitheater = new Vector2D(windowWidth * 564 / 800, windowHeight * 326 / 400);

        studentNames = new String[] {"Abay", "Abilda", "Aldamzhar", "Danel", "Maxim", "Meirzhan", "Sherkhan", "Dnislam", "Anuar", "Temirzhan"};
        map = new UniversityMap("NU", new Vector2D(0.0, 0.0), new Stationary(), this, "NUMap-Faded.jpg");
        academicians          = new ArrayList <Academician>      ();
        speakers              = new ArrayList <Speaker>          ();
        students              = new ArrayList <Student>          ();
        assessments           = new ArrayList <Assessment>       ();
        assessmentFactoryList = new ArrayList <AssessmentFactory>();

        randomizer = new Random();

        assessmentFactoryList.add(new LabFactory(this));
        assessmentFactoryList.add(new QuizFactory(this));
        assessmentFactoryList.add(new HomeworkFactory(this));

        Academician Katsu = new Academician("Katsu", randomPositionFromBorder(25), newPersonState(), this, "ShigeoKatsu.gif");
        Academician Tourassis = new Academician("Tourassis", randomPositionFromBorder(25), newPersonState(), this, "VassiliosTourassis.gif");
        Academician Nivelle = new Academician("Nivelle", randomPositionFromBorder(25), newPersonState(), this, "HansDeNivelle.gif");
        Academician Temizer = new Academician("Temizer", randomPositionFromBorder(25), newPersonState(), this, "SelimTemizer.gif");

        academicians.add(Katsu);
        academicians.add(Tourassis);
        academicians.add(Nivelle);
        academicians.add(Temizer);

        Speaker Tokayev = new Speaker("Tokayev", amphitheater.plus(new Vector2D(-100.0, 0.0)), state, this, "KassymJomartTokayev.gif");
        Speaker Nazarbayev = new Speaker("Nazarbayev", amphitheater.plus(new Vector2D(100.0, 0.0)), state, this, "NursultanNazarbayev.gif");
        speakers.add(Tokayev);
        speakers.add(Nazarbayev);

        for(int i = 0; i < numOfStudents; ++ i){
            students.add(new Student(studentNames[randomInt(0, 9)], randomPositionFromBorder(15), newStudentState(), this));
        }
    }

    public int randomInt(int from, int to){
        to = to - from + 1;
        return randomizer.nextInt(to) + from;
    }

    private Vector2D randomDirection(){
        return new Vector2D(randomInt(-20, 20), randomInt(-20, 20));
    }

    private Vector2D randomPositionFromBorder(int border){
        int nX = randomInt(border, windowWidth - border);
        int nY = randomInt(border, windowHeight - border);
        return new Vector2D(nX, nY);
    }

    private State newPersonState(){
        int randInt = randomInt(1, 3);
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
        }
        return null;
    }

    private State newStudentState(){
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
        return null;
    }

    public void stepAllEntities(){
        for(Academician a : academicians){
            a.step();
            if(!(a.state instanceof Rest) && !(a.state instanceof Stationary) && randomInt(1, 10) == 1){
                AssessmentFactory assessmentFactory = assessmentFactoryList.get(randomInt(0, assessmentFactoryList.size() - 1));
                int nX = (int)a.position.x + (randomInt(0, 1) == 1 ? 1 : -1) * randomInt(15, 60);
                int nY = (int)a.position.y + (randomInt(0, 1) == 1 ? 1 : -1) * randomInt(15, 60);
                if(nX < 0) nX = 10;
                if(nY < 0) nY = 10;
                if(nX > windowWidth) nX = windowWidth - 10;
                if(nY > windowHeight) nY = windowHeight - 10;
                Vector2D assessmentPosition = new Vector2D(nX, nY);
                Assessment assessment = assessmentFactory.createAssessment(assessmentPosition);
                assessments.add(assessment);
            }
            if(a.state.isOver == true){
                a.state = newPersonState();
            }
        }

        for(Student student : students){
            student.step();
            if(student.grade < 100){
                for(int i = assessments.size() - 1; i >= 0; -- i){
                    Assessment assess = assessments.get(i);
                    double dist = student.position.distanceTo(assess.position);
                    if(dist <= 10.0){
                        student.grade += assess.points;
                        assessments.remove(i);
                    }
                }
            }
            if(student.state.isOver){
                if(student.grade < 100){
                    student.state = newStudentState();
                } else
                if(student.position.distanceTo(amphitheater) <= 25.0){
                    student.position = amphitheater;
                } else {
                    Vector2D newStudentPosition = amphitheater.plus(
                            new Vector2D(randomInt(-10, 10), randomInt(-10, 10))
                            );
                    student.state = new GotoXY(newStudentPosition, randomInt(2, 5));
                }
            }
        }

        boolean isGraduation = true;
        for(Student s : students){
            if(s.grade < 100){
                isGraduation = false;
                break;
            }
        }
        if(isGraduation && !graduated){
            for(int i = 0; i < academicians.size(); ++ i){
                Academician a = academicians.get(i);
                a.position = amphitheater.plus(new Vector2D(-150 + i * 100, -120));
                a.state = this.state;
            }
        }
        graduated = true;
    }
}
