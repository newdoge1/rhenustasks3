package task1;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.println5n3(1);
    }

    public void println5n3(int i) {
        for (; i <= 100; i++) {
            if ((((i % 3) != 0) && ((i % 5) != 0))) {
                System.out.println(i);
            }

            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("teilbar3und5");
                continue;
            }

            if ((i % 3) == 0) {
                System.out.println("teilbar3");
            } else if ((i % 5) == 0) {
                System.out.println("teilbar5");
            }
        }
    }
}