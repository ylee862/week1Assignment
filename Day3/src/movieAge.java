public class movieAge {
    public static void main(String[] args) {
        int age = 30;

        if (age < 0) {
            System.out.println("유아 관람불가");
        }
        else if (0 <= age && age < 12) {
            System.out.println("전체 관람가");
        }

        else if (12 <= age && age < 15) {
            System.out.println("12세 이상 관람가");
        }

        else if (15 <= age && age < 19) {
            System.out.println("15세 이상 관람가");
        }
        else {
            System.out.println("청소년 관람불가");
        }
    }

}
