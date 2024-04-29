import java.util.LinkedList;

public class Student {

    private String firstName, lastName, major, classStanding;
    private int id;
    private double gpa;
    private LinkedList<String> courseList = new LinkedList<>();

    public Student(String firstName, String lastName, String major, String classStanding, int id, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.classStanding = classStanding;
        this.id = id;
        this.gpa = gpa;
    }

    public void addCourse(String course) {
        courseList.add(course);
    }

    public void removeCourse(String course) {
        courseList.remove(course);
    }

    public void sortCourseList() {
        String temp;
        for(int i = 1; i < courseList.size(); i++) {
            for(int j = i; j > 0; j--) {
                if(courseList.get(j).compareTo(courseList.get(j - 1)) < 0) {
                    temp = courseList.get(j);
                    courseList.set(j, courseList.get(j-1));
                    courseList.set(j-1, temp);
                }
            }
        }
    }

    public String getAllCourses() {
        StringBuilder info = new StringBuilder();
        for(String course: courseList) {
            info.append(course.toString()).append("\n");
        }
        return info.toString();
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\nMajor: " + major + "\nClass Standing: " + classStanding + "\nID: " + id + "\nGPA: " + gpa;
    }
}
