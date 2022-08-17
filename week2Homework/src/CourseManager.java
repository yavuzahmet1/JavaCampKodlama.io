public class CourseManager {

    public void add(Course course){
        System.out.println(course.courseName+" kursu "+course.courseDuration+" hafta süreyle eklenmiştir.");
    }

    public void delete(Course course){
        System.out.println(course.courseName+" kursu silinmiştir.");
    }
}
