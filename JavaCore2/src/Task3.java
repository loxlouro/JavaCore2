public class Task3 {
    public static void doSmtg(){
        int length = 10;
        int[] array = new int[length];
        for (
                int i = 0;
                i < length; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.print(array[i] + "\t");
        }
        System.out.println("В массиве есть последовательность 00: " +
                has00(array));
    }
    public static boolean has00(int[] array){
        for (int i=1;i< array.length;i++) {
            if (array[i-1]==array[i]&&array[i]==0)return true;
        }
        return false;
    }
}
