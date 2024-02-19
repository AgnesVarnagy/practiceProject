package FirstAttemp;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {100, 2, -9, 65};

        System.out.println("A tömb hossza: " + numbers.length);

        int[] otherNumbers = new int [10];

        System.out.println("A tömb hossza: " + otherNumbers.length);

        boolean[] isValid = {true, false, true, true, false, false};

        System.out.println("A boolean tömb hossza: " + isValid.length);

        String[] names = {"Anna, Kata, Zsolt, Zenkő"};
        String[] text = new String[3];
                text[0] = "Hello";
                text[1] = "Webler";
                text[2] = "kurzus!";
        System.out.println(text[0] + " " + text[1] + " " + text[2]);

        int size = text.length;

        System.out.println("A text szavainak darabszáma: " + size);

        String[] array = new String[32];
        array[2] = "Van érték!";
        array[30] = "Itt is!";

        System.out.println(array[2]);
        System.out.println(array[30]);

        int[] nums = new int[10];
        nums[5] = -5;
        nums[6] = 0;
        nums[9] = 9;
        System.out.println(nums[5] + nums[6] + nums[9]);
        System.out.println(nums[5]);

    }
}
