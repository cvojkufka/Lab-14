public class Main {
    public static void main(String[] args) {

        Student student = new Student("Chris", "Vojkufka", "Computer Science", "Freshman", 123456, 4.7);

        student.addCourse("Art History");
        student.addCourse("Swimming");
        student.addCourse("History");

        System.out.print("Print student info:\n" + student.toString() + "\n");

        System.out.print("\nUnordered Courses:\n" + student.getAllCourses());
        student.sortCourseList();
        System.out.print("\nOrdered Courses:\n" + student.getAllCourses());

        student.removeCourse("Swimming");

        System.out.print("\nNew Courses:\n" + student.getAllCourses());

    }
}
