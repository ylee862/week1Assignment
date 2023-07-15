public class Student {

    private String name;
    private int studentNum;
    private String major;
    private int studentYear;

    Student(String name, int studentNum, String major, int studentYear) {
        this.name = name;
        this.studentNum = studentNum;
        this.major = major;
        this.studentYear = studentYear;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return studentNum;
    }

    public String getMajor() {
        return major;
    }

    public int getYear () {
        return studentYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }



}
