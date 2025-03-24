
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest {
    @Test
    void testFormaToString(){
        Cilindro ci=new Cilindro(5,6);
        Rectangulo re=new Rectangulo(3,4);
        Esfera es=new Esfera(6);
        ci.toString();
        re.toString();
        es.toString();
    }
    @Test
    void testFormaArea() {
        Cilindro ci = new Cilindro(5, 6);
        Rectangulo re = new Rectangulo(3, 4);
        Esfera es = new Esfera(6);
        assertEquals(471.23,ci.area(),0.01);
        assertEquals(12.0,re.area(),0.01);
        assertEquals(452.38,es.area(),0.01);
    }
}
