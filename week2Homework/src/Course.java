public class Course {
    String courseName;
    String teacher;
    int courseDuration;

    public Course(String courseName, String teacher, int courseDuration) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.courseDuration = courseDuration;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

}
