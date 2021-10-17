package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class wordFrequencyTest {

    @Test
    void read() {
        wordFrequency app = new wordFrequency();
        assertTrue(app.read());
    }

    @Test
    void parse() {
        wordFrequency app = new wordFrequency();
        assertTrue(app.parse());
    }

    @Test
    void output() {
        wordFrequency app = new wordFrequency();
        app.read();
        app.parse();
        String expected = """
                badger:   *******
                mushroom: **
                snake:    *""";
        assertEquals(expected, app.output());
    }
}