package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dataParseTest {

    @Test
    void read() {
        dataParse app = new dataParse();
        assertTrue(app.read("data/exercise42_input.txt"));
    }

    @Test
    void parse() {
        dataParse app = new dataParse();
        app.read("data/exercise42_input.txt");
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
        app.read("data/exercise42_input.txt");
        app.parse();
        assertEquals(expected, app.output());
    }

    @Test
    void readFail() {
        dataParse app = new dataParse();
        assertFalse(app.read("data/fakeFile.txt"));
    }

    @Test
    void parseFail() {
        dataParse app = new dataParse();
        app.read("data/fakeFile.txt");
        assertFalse(app.parse());
    }

    @Test
    void outputFail() {
        dataParse app = new dataParse();
        String expected = """
                Last      First     Salary
                --------------------------
                Ling      Mai       55900
                Johnson   Jim       56500
                Jones     Aaron     46000
                Jones     Chris     34500
                Swift     Geoffrey  14200
                Xiong     Fong      65000
                Zarnecki  Sabrina   51500
                """;
        app.read("data/fakeFile.txt");
        app.parse();
        assertNotEquals(expected, app.output());
    }
}