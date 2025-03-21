public class Forma {
    String nombre;

    @Override
    public String toString() {
        return "forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public double area(){
        return 0;
    }
}
class Esfera extends Forma {
    double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return 4*Math.PI*radio*radio;
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                '}';
    }
}
class Rectangulo extends Forma{
    double longitud;
    double ancho;

    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return longitud*ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "longitud=" + longitud +
                ", ancho=" + ancho +
                '}';
    }
}
class Cilindro extends Forma{
    double radio;
    double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio*altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "radio=" + radio +
                ", altura=" + altura +
                '}';
    }
}
