package model;

public class Advising {
    private String studentId;
    private String courseId;
    private String courseTitle;
    private Integer courseCredit;

    public Advising() {
    }
    public Advising(String studentId,String courseId, String courseTitle, Integer courseCredit){
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseCredit = courseCredit;
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public String getStudentId(){
        return studentId;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }
}
