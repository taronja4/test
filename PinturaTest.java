import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinturaTest {
    @Test
    void testPintura(){
        Pintura pi=new Pintura(250);
        Cilindro ci = new Cilindro(5, 6);
        Rectangulo re = new Rectangulo(3, 4);
        Esfera es = new Esfera(6);
        assertEquals(1.88,pi.CantidadAPintar(ci),0.01);
        assertEquals(0.04,pi.CantidadAPintar(re),0.01);
        assertEquals(1.80,pi.CantidadAPintar(es),0.01);
    }
}