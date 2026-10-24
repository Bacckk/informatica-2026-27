class Vettore {
    Punto origine;
    Punto vertice;

    Vettore(Punto origine, Punto vertice) {
        this.origine = origine;
        this.vertice = vertice;
    }

    double calcolaLunghezza() {
        double dx = vertice.x - origine.x;
        double dy = vertice.y - origine.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    Vettore spostaOrigine(Punto p) {
        double dx = p.x - origine.x;
        double dy = p.y - origine.y;
        Punto nuovoVertice = new Punto(vertice.x + dx, vertice.y + dy);
        return new Vettore(p, nuovoVertice);
    }

    boolean verificaOrigine(Punto p) {
        return origine.x == p.x && origine.y == p.y;
    }
}
