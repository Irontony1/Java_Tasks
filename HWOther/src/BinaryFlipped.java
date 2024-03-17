public class BinaryFlipped {

    public static Integer[] binaryFlipped(Integer[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] ^= 1;
        }
        return array;
    }
}
