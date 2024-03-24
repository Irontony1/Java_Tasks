import java.util.Arrays;
public class ArraysMetod {

    public static int differenceMaxMin(int[] array){
        int len = array.length;

        Arrays.sort(array);

        return array[len - 1] - array[0];
    }

    public static int countEvents(int[] array){
        int len = array.length;
        int counerEventNumber = 0;
        for (int i = 0; i < len ; i++) {
            if(i % 2 == 0) counerEventNumber++;
        }
        return counerEventNumber;
    }

    public static boolean isCoupleZero(int[] arrray){
        int len = arrray.length;
        for(int i = 0; i < len - 1; i++){
            if(arrray[i] == 0 & arrray[i + 1] == 0) return true;
        }
        return false;
    }
}
