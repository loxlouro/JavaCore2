public class Task2 {
    public static void doSmtg(){
        int length = 10;
        int[] array = new int[length];
        for (
                int i = 0;
                i < length; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.print(array[i] + "\t");
        }
        System.out.println("Разница между min и max в массиве: " +

                difference(array));
    }
    private static int difference(int[] array){
        int max=array[0];
        int min=array[0];
        for (int i:array
             ) {
            if(i<min)min=i;
            if(i>max)max=i;
        }
        return (max-min);
    }
}
