package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class wordFrequencyTest {

    @Test
    void read() {
        wordFrequency app = new wordFrequency();
        assertTrue(app.read("data/exercise46_input.txt"));
    }

    @Test
    void parse() {
        wordFrequency app = new wordFrequency();
        assertTrue(app.parse());
    }

    @Test
    void output() {
        wordFrequency app = new wordFrequency();
        app.read("data/exercise46_input.txt");
        app.parse();
        String expected = """
                badger:   *******
                mushroom: **
                snake:    *""";
        assertEquals(expected, app.output());
    }

    @Test
    void readError() {
        wordFrequency app1 = new wordFrequency();
        assertFalse(app1.read("data/fakeFile.txt"));
    }

    @Test
    void parseError() {
        wordFrequency app1 = new wordFrequency();
        assertFalse(app1.parse());
    }

    @Test
    void outputError() {
        wordFrequency app1 = new wordFrequency();
        app1.read("data/fakeFile.txt");
        app1.parse();
        String expected = """
                badger:   *******
                mushroom: **
                snake:    *""";
        assertNotEquals(expected, app1.output());
    }
}