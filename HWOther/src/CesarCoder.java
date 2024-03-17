public class CesarCoder {

    public String recoding(String in, int offset, boolean decode){
        char[] chars = in.toCharArray();
        if (in.isEmpty()){
            return null;
        }
        if (decode) {
            for (int i = 0; i < chars.length; i++) {
                if (Character.isLetter(chars[i]) && Character.isUpperCase(chars[i]))
                    chars[i] = (char) (((chars[i] + offset - 'A' ) % 26) + 'A');
                else if (Character.isLetter(chars[i]) && Character.isLowerCase(chars[i]))
                    chars[i] = (char) (((chars[i] + offset - 'a' ) % 26) + 'a');
                else i++;
            }
        }
        if (!decode){
            for (int i = 0; i < chars.length; i++) {
                if (Character.isLetter(chars[i]) && Character.isUpperCase(chars[i])) {
                    chars[i] = (char) (((chars[i] - offset - 'Z') % 26) + 'Z');
                }
                else if (Character.isLetter(chars[i]) && Character.isLowerCase(chars[i])) {
                    chars[i] = (char) (((chars[i] - offset - 'z') % 26) + 'z');
                }
                else i++;
            }
        }
        return String.valueOf(chars);
    }

}
