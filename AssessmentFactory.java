public abstract class AssessmentFactory {
    public Common common;

    public abstract Assessment(Vector2D position);

    public AssessmentFactory(Common common){
        this.common = common;
    }
}
