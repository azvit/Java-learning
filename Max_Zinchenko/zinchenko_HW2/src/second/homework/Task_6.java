package second.homework;

public class Task_6 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("%3d", (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}
