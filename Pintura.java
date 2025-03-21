public class Pintura {
    double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double CantidadAPintar(Forma foooo){
        return foooo.area()/cobertura;
    }
}
