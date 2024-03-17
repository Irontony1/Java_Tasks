import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String codingText = new CesarCoder().recoding("Hellow World! :-)", 6, true);
        System.out.println(codingText);
        String recodingText = new CesarCoder().recoding(codingText, 6, false);
        System.out.println(recodingText);

        Integer[] array = new Integer[] {1,2,3,4,5,6,7,8,9,10};
        Integer[] outArray = ShiftArray.shiftArray(array, 4);
        System.out.println(Arrays.toString(outArray));

        Integer[] outArray1 = BinaryFlipped.binaryFlipped(new Integer[] {1,0,1,0,0,1,1,0,1,0});
        System.out.println(Arrays.toString(outArray1));
    }

}
