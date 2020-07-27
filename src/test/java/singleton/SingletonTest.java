package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void whenGetTwoSingletonThenIsEquals() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        assertNotNull(s1);
        assertNotNull(s2);
        assertTrue(s1 == s2);
    }



}