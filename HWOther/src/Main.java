public class Main {

    public static void main(String[] args) {
        String codingText = new CesarCoder().recoding("Hellow World! :-)", 6, true);
        System.out.println(codingText);
        String recodingText = new CesarCoder().recoding(codingText, 6, false);
        System.out.println(recodingText);
    }

}
