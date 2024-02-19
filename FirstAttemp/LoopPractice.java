package FirstAttemp;

public class LoopPractice {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++) {
            System.out.println("for loop: " + i);
        }
        int i1 = 0;
        while (i1 < 5) {
            System.out.println("while lop: " + i1);
            i1++;
        }
        int i2 = 0;
        do {
            System.out.println("do while: " + i2);
            i2++;
        }while (i2 < 5);

        int [] numbers = {10, 5, 6, 7};
        for (int num : numbers) {
            System.out.println("enhanced for loop:" + num);
        }

    }
}
