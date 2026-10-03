public class Rettangolo {

    public Punto a;
    public Punto b;


    public Rettangolo(Punto puntoA, Punto puntoB) {
        a = puntoA;
        b = puntoB;
    }


    public double calcolaPerimetro() {
        double base = b.x - a.x;
        double altezza = b.y - a.y;
        return (base + altezza) * 2;
    }


    public double calcolaArea() {
        double base = b.x - a.x;
        double altezza = b.y - a.y;
        return base * altezza;
    }
}
