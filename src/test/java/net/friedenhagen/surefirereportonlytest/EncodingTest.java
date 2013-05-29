package net.friedenhagen.surefirereportonlytest;

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
        assumeNoException("&auml;&ouml;&uuml;&szlig;", exception);
    }
}
