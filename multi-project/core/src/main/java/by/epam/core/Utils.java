package by.epam.core;

import by.epam.util.StringUtils;

import java.util.Arrays;

public class Utils {
    public boolean isAllPositiveNumbers(String... str) {
        StringUtils stringUtils = new StringUtils();
        return Arrays.stream(str).
                allMatch(stringUtils::isPositiveNumber);
    }
}
