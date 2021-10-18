package baseline;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class nameSorterTest {

    @Test
    void read() {
        nameSorter app = new nameSorter();
        assertTrue(app.read("data/exercise41_input.txt"));
    }

    @Test
    void sort() {
        nameSorter app = new nameSorter();
        app.read("data/exercise41_input.txt");
        assertTrue(app.sort());
    }

    @Test
    void output() throws IOException {
        nameSorter app = new nameSorter();
        StringBuilder table = new StringBuilder();
        String expected = "Total of 7 names\n" +
                "-----------------\n" +
                "Johnson, Jim\n" +
                "Jones, Aaron\n" +
                "Jones, Chris\n" +
                "Ling, Mai\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong\n" +
                "Zarnecki, Sabrina\n";
        app.read("data/exercise41_input.txt");
        app.sort();
        app.output();

        try(BufferedReader buff = new BufferedReader(new FileReader("data/exercise41_output.txt"))){
            String line;
            while((line = buff.readLine()) != null){
                table.append(line).append("\n");
            }
        }
        assertEquals(expected, table.toString());
    }

    @Test
    void readFail() {
        nameSorter app = new nameSorter();
        assertFalse(app.read("data/fakeFile.txt"));
    }

    @Test
    void sortFail() {
        nameSorter app = new nameSorter();
        app.read("data/fakeFile.txt");
        assertFalse(app.sort());
    }
}