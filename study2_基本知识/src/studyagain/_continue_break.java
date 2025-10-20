package studyagain;

public class _continue_break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 5)
                break;
            System.out.println(i);
        }
    }
}
