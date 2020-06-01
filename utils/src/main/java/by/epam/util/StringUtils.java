package by.epam.util;

public class StringUtils {
    public boolean isPositiveNumber(String str) {
        try {
            return Double.parseDouble(str) > 0.0;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Argument is not a number : " + str);
        }
    }
}
