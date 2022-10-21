import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
      assertEquals("Los números negativos no son cuadrados", false, Square.isSquare(-1));
      assertEquals("0 es un cuadrado (0 * 0)",    true,   Square.isSquare(0));
      assertEquals("3 no es un cuadrado", false,  Square.isSquare(3));
      assertEquals("4 es cuadrado (2 * 2)",    true,   Square.isSquare(4));
      assertEquals("25 es cuadrado (5 * 5)",   true,   Square.isSquare(25));
      assertEquals("26 no es cuadrado",false,  Square.isSquare(26));      
    }
}