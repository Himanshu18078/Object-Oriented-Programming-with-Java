package Problem52;

public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String [] enrolledStudent= new String[maxCapacity];
    Course(String name){
        this.courseName =name;
        this.enrollments = 0;
    }
    static void setMaxCapacity(int number){
         maxCapacity = number;
    }
    void enrollStudent(String studentName){
        enrolledStudent[enrollments] = studentName;
        enrollments++;
    }
    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }

}
