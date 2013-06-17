package net.friedenhagen.surefireencodingtest;

import java.nio.charset.Charset;
import static org.junit.Assume.assumeNoException;
import org.junit.Test;

/**
 *
 * @author Mirko Friedenhagen
 */
public class EncodingTest {
    @Test
    public void throwAssumption() {
        final IllegalStateException exception = new IllegalStateException("äöüß");
        System.out.println(exception);
        System.out.println(Charset.defaultCharset());
        assumeNoException("&auml;&ouml;&uuml;&szlig;", exception);
    }
}
