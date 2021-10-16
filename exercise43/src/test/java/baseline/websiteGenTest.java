package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class websiteGenTest {

    @Test
    void setName() {
        websiteGen app = new websiteGen();
        assertTrue(app.setName("amazingco"));
    }

    @Test
    void setAuthor() {
        websiteGen app = new websiteGen();
        assertTrue(app.setAuthor("Max Powers"));
    }

    @Test
    void setJavaScript() {
        websiteGen app = new websiteGen();
        assertTrue(app.setJavaScript("y"));
    }

    @Test
    void setCSS() {
        websiteGen app = new websiteGen();
        assertTrue(app.setCSS("y"));
    }

    @Test
    void create() {
        websiteGen app = new websiteGen();
        app.setName("amazingco");
        app.setAuthor("Max Powers");
        app.setJavaScript("y");
        app.setCSS("y");

        String result = "";
        String expected = """
                Created data/website/amazingco
                Created data/website/amazingco/index.html
                Created data/website/amazingco/js/
                Created data/website/amazingco/css/
                """;
        try{
            result = app.create();
        }catch (Exception e){
            e.printStackTrace();
        }
        assertEquals(expected, result);
    }
}