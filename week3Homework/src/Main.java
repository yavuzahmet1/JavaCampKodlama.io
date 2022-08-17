public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Instructor ahmet=new Instructor();
        ahmet.setId(10);
        student.setId(2000);

        UserManager userManager=new UserManager();
        User[] users={student,ahmet};
        userManager.addMultiple(users);
    }
}
