package by.epam.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void isPositiveNumberTest() {
        StringUtils utils = new StringUtils();
        Assert.assertFalse(utils.isPositiveNumber("-22.99"));
    }
}
