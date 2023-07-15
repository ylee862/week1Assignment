public class StudentManagementSystem {
    private int studentAmount;
    private Student[] arrayOfStudent;

    StudentManagementSystem(int amount) {
        this.studentAmount = 0;
        this.arrayOfStudent = new Student[amount];
    }

    public void addStudent(Student student) {
        if (studentAmount < arrayOfStudent.length) {
            arrayOfStudent[studentAmount] = student;
            studentAmount++;
            System.out.println("학생 추가: " + student.getName());
        } else {
            System.out.println("더이상 추가할수 없습니다");
        }
    }

    public void searchStudent(int studentNum) {

        for (int i = 0; i < studentAmount; i++) {
            if (arrayOfStudent[i].getNum() == studentNum) {
                System.out.println("학생을 찾았습니다: ");
                System.out.println("이름: " + arrayOfStudent[i].getName());
                System.out.println("학번: " + arrayOfStudent[i].getNum());
                System.out.println("전공: " + arrayOfStudent[i].getMajor());
                System.out.println("학년: " + arrayOfStudent[i].getYear());

            }
        }
        System.out.println("학생을 찾을수 없습니다");
    }

    public void removeStudent(Student student) {
        for (int i = 0 ; i < studentAmount; i++) {
            if (arrayOfStudent[i] == student) {
                for (int j = i; j < studentAmount - 1; j++) {
                    arrayOfStudent[j] = arrayOfStudent[j+1];
                }
                arrayOfStudent[studentAmount-1] = null;
                studentAmount--;
                System.out.println("학생 삭제: " + student.getName());
            }
        }
        System.out.println("학생을 찾을 수 없습니다");
    }
}
