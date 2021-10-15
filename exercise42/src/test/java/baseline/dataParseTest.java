package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dataParseTest {

    @Test
    void read() {
        dataParse app = new dataParse();
        assertTrue(app.read());
    }

    @Test
    void parse() {
        dataParse app = new dataParse();
        app.read();
        assertTrue(app.parse());
    }

    @Test
    void output() {
        dataParse app = new dataParse();
        String expected = "Last      First     Salary\n" +
                "--------------------------\n" +
                "Ling      Mai       55900\n" +
                "Johnson   Jim       56500\n" +
                "Jones     Aaron     46000\n" +
                "Jones     Chris     34500\n" +
                "Swift     Geoffrey  14200\n" +
                "Xiong     Fong      65000\n" +
                "Zarnecki  Sabrina   51500\n";
        app.read();
        app.parse();
        assertEquals(expected, app.output());
    }
}