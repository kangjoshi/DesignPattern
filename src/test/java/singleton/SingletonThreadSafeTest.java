package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonThreadSafeTest {

    @Test
    public void whenGetTwoSingletonThenIsEquals() {
        SingletonThreadSafe s1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe s2 = SingletonThreadSafe.getInstance();

        assertNotNull(s1);
        assertNotNull(s2);
        assertTrue(s1 == s2);
    }

}