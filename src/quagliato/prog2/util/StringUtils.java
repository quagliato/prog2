package quagliato.prog2.util;

/**
 *
 * @author eduardo
 */
public class StringUtils {
    
    public static final int LEFT = 1;
    public static final int RIGHT = 2;

    public static String repeat(char c, int size) {
        if (size == 0) 
            return null;

        String result = "";
        for (int i = 0; i < size; i++) {
            result = result + c;
        }
        return result;
    }
    
    public static String fillWithSpaces(String s, int size, int side) {
        if (size == 0 || size < s.length()) 
            return s;
        
        String result = "";
        
        if (StringUtils.LEFT == side)
            result = StringUtils.repeat(' ', size - s.length()) + s;
        else if (StringUtils.RIGHT == side)
            result = s + StringUtils.repeat(' ', size - s.length());
        
        return result;
    }
}
