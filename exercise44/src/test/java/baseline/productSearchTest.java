package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class productSearchTest {

    @Test
    void setSearchSuccess() {
        productSearch app = new productSearch();
        assertTrue(app.setSearch("Thing"));
    }

    @Test
    void getProductSuccess() {
        productSearch app = new productSearch();
        String actual = "";
        String expected = """
                Name: Thing
                Price: 15.00
                Quantity: 5""";
        app.setSearch("Thing");
        try{
            actual = app.getProduct();
        }catch (Exception e){
            e.printStackTrace();
        }

        assertEquals(expected, actual);
    }

    @Test
    void setSearchFail() {
        productSearch app = new productSearch();
        assertFalse(app.setSearch(""));
    }

    @Test
    void getProductFail() {
        productSearch app = new productSearch();
        String actual = "";
        app.setSearch("hdfjhf");
        try{
            actual = app.getProduct();
        }catch (Exception e){
            e.printStackTrace();
        }

        assertEquals("", actual);
    }
}