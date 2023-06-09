public class Task1 {
    public static void doSmtg() {

        int length = 10;
        int[] array = new int[length];
        for (
                int i = 0;
                i < length; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.print(array[i] + "\t");
        }
        System.out.println("Четных чисел в массиве: " +

                countEven(array));
    }

    private static int countEven(int[] nums) {
        int count = 0;
        for (int i : nums
        ) {
            if (i % 2 == 0) count++;
        }
        return count;
    }
}