
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
        assertEquals(471.23889803846896,ci.area());
        assertEquals(12.0,re.area());
        assertEquals(452.3893421169302,es.area());
    }

    @Test
    void testPintura(){
        Pintura pi=new Pintura(250);
        Cilindro ci = new Cilindro(5, 6);
        Rectangulo re = new Rectangulo(3, 4);
        Esfera es = new Esfera(6);
        assertEquals(1.8849555921538759,pi.CantidadAPintar(ci));
        assertEquals(0.048,pi.CantidadAPintar(re));
        assertEquals(1.8095573684677209,pi.CantidadAPintar(es));
    }
}