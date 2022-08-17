public class Main {

    public static void main(String[] args) {
        Course course1 = new Course("Java", "Engin DEMİROG", 16);
        Course course2 = new Course("C#", "Engin DEMİROG", 21);
        Course course3 = new Course("Java Script", "Engin DEMİROG", 14);
        Course course4 = new Course("Programlamaya Giriş için Temel Kurs", "Engin DEMİROG", 2);
        Course course5=new Course("C++","Evren Sadi ŞEKER",14);
        Course[] courses = {course1, course2, course3, course4};

        for (Course course : courses) {
            System.out.println("****");
            System.out.println(course.courseName);
            System.out.println(course.teacher);
            System.out.println(course.courseDuration);
        }

        CourseManager courseManager=new CourseManager();
        courseManager.add(course5);
        courseManager.add(course2);
        courseManager.add(course3);
        courseManager.delete(course1);

    }
};