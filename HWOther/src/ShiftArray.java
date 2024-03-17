public class ShiftArray {

    public static Integer[] shiftArray(Integer[] array, int offset){
        Integer[] outArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            if (offset + i <= array.length - 1) outArray[i + offset] = array[i];
            else outArray[i + offset - array.length] = array[i];
        }
        return outArray;
    }
}
