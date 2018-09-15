package hardian2geek.recyclerviewdatabinding.Model;

/**
 * Created by HR_21 on 9/15/2018.
 */
public class Course {

    private String courseID;
    private String courseType;
    private String courseName;
    private String coursePlanStart;
    private String coursePlanEnd;
    private boolean isDone;

    public Course(String courseID, String courseType, String courseName, String coursePlanStart, String coursePlanEnd, boolean isDone) {
        this.courseID = courseID;
        this.courseType = courseType;
        this.courseName = courseName;
        this.coursePlanStart = coursePlanStart;
        this.coursePlanEnd = coursePlanEnd;
        this.isDone = isDone;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePlanStart() {
        return coursePlanStart;
    }

    public void setCoursePlanStart(String coursePlanStart) {
        this.coursePlanStart = coursePlanStart;
    }

    public String getCoursePlanEnd() {
        return coursePlanEnd;
    }

    public void setCoursePlanEnd(String coursePlanEnd) {
        this.coursePlanEnd = coursePlanEnd;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
