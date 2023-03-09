import me.blueysh.jutil.Converters;
import me.blueysh.jutil.Checks;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JutilTests {
    @Test
    void testHoursToMillis() {
        assertEquals(3600000f, Converters.hoursToMillis(1f));
        assertEquals(10800000f, Converters.hoursToMillis(3f));
        assertEquals(86400000f, Converters.hoursToMillis(24f));
        assertEquals(5400000f, Converters.hoursToMillis(1.5f));
    }

    @Test
    void testDaysToMillis() {
        assertEquals(259200000f, Converters.daysToMillis(3f));
        assertEquals(3283200000f, Converters.daysToMillis(38f));
        assertEquals(475200000f, Converters.daysToMillis(5.5f));
        assertEquals(7214400000f, Converters.daysToMillis(83.5f));
    }

    @Test
    void testIsNull() {
        Object o = null;
        assertTrue(Checks.isNull(o));
        assertTrue(Checks.isNull(o, () -> System.out.println("Callback test")));
    }

    @Test
    void testInRange() {
        assertFalse(Checks.inRange(1, 5, 6));
        assertTrue(Checks.inRange(1, 6, 3));
        assertFalse(Checks.inRange(5, 7, 4));
        assertTrue(Checks.inRange(49, 105, 55));
    }
}
