package quagliato.prog2.util;

import quagliato.prog2.exceptions.StringException;

/**
 *
 * @author eduardo
 */
public class StringUtils {

    public static String repeat(char c, int size) {
        if (size == 0) 
            return null;

        String result = "";
        for (int i = 0; i < size; i++) {
            result = result + c;
        }
        return result;

    }
}
