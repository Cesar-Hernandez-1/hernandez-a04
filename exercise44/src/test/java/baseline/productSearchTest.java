package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class productSearchTest {
    @Test
    void getProductSucess() {
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