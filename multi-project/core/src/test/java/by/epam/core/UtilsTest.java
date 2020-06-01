package by.epam.core;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {
    @Test
    public void utilsTest() {
        Utils utils = new Utils();
        Assert.assertTrue(utils.isAllPositiveNumbers("12.23","11.5","13.6"));
    }
}
