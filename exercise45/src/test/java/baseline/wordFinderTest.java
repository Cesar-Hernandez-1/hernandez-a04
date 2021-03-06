package baseline;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class wordFinderTest {

    @Test
    void readNoError() {
        wordFinder app = new wordFinder();
        assertTrue(app.read("data/exercise45_input.txt"));
    }

    @Test
    void parse() {
        wordFinder app = new wordFinder();
        app.read("data/exercise45_input.txt");
        assertTrue(app.parse());
    }

    @Test
    void write() {
        wordFinder app = new wordFinder();
        app.parse();
        StringBuilder text = new StringBuilder();
        app.write();

        String expected = """
                One should never use the word "use" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                uses an IDE to write her Java programs".
                """;

        try(BufferedReader buff = new BufferedReader(new FileReader("data/exercise45_output.txt"))){
            String line;
            while((line = buff.readLine()) != null){
                text.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(expected, text.toString());
    }

    @Test
    void readError() {
        wordFinder app1 = new wordFinder();
        assertFalse(app1.read("data/fakeFile.txt"));
    }

    @Test
    void parseError() {
        wordFinder app = new wordFinder();
        app.read("data/fakeFile.txt");
        assertFalse(app.parse());
    }

    @Test
    void writeError() {
        wordFinder app1 = new wordFinder();
        app1.parse();
        StringBuilder text = new StringBuilder();
        app1.write();

        String expected = """
                One should never use the word "use" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                uses an IDE to write her Java programs".
                """;

        try(BufferedReader buff = new BufferedReader(new FileReader("data/exercise45_output.txt"))){
            String line;
            while((line = buff.readLine()) != null){
                text.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertNotEquals(expected, text.toString());
    }
}