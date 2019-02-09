package CasC;

public class Result {
    Course course;
    Student student;
    double mark;

    public Result(Course course, Student student, double mark) {
        this.course = course;
        this.student = student;
        this.mark = mark;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
