// StringBuffer Problem 1: Concatenate Strings Efficiently
public class StringBufferConcatenate {
    public static String concatenate(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) sb.append(s);
        return sb.toString();
    }
}
