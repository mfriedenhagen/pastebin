package net.friedenhagen.surefireencodingtest;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Mirko Friedenhagen
 */
public class EncodingTest {
    @Test
    public void throwAssumption() {
        final IllegalStateException exception = new IllegalStateException("äöüß");
        assertNotNull(exception);
    }
}
