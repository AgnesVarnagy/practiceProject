package FirstAttemp;

public class LoopPractice2 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);

        }

        for (int i = 0; i < 5; i += 2) {
            System.out.println(i);

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i++);

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(++i);

        }

        int[] numbers = {10, 20, 30, 40};
        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i);
            

        }
    }
}
