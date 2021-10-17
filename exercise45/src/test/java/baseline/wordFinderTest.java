package baseline;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class wordFinderTest {

    @Test
    void read() {
        wordFinder app = new wordFinder();
        assertTrue(app.read());
    }

    @Test
    void parse() {
        wordFinder app = new wordFinder();
        assertTrue(app.parse());
    }

    @Test
    void write() {
        wordFinder app = new wordFinder();
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
}