class Angolo {

    public int gradi;
    public int minuti;
    public int secondi;

    public Angolo(int g, int m, int s) {
        gradi = g;
        minuti = m;
        secondi = s;

        if (secondi >= 60) {
            minuti = minuti + (secondi / 60);
            secondi = secondi % 60;
        }

        if (minuti >= 60) {
            gradi = gradi + (minuti / 60);
            minuti = minuti % 60;
        }

        if (gradi >= 360) {
            gradi = gradi % 360;
        }
    }

    public Angolo sommaAngolo(Angolo a) {
        int g = this.gradi + a.gradi;
        int m = this.minuti + a.minuti;
        int s = this.secondi + a.secondi;
        return new Angolo(g, m, s);
    }

    public Angolo sottraiAngolo(Angolo a) {
        int g = this.gradi - a.gradi;
        int m = this.minuti - a.minuti;
        int s = this.secondi - a.secondi;

        if (s < 0) {
            s = s + 60;
            m = m - 1;
        }
        if (m < 0) {
            m = m + 60;
            g = g - 1;
        }
        if (g < 0) {
            g = g + 360;
        }
        return new Angolo(g, m, s);
    }

    public void stampa() {
        System.out.println(gradi + " gradi, " + minuti + " minuti, " + secondi + " secondi");
    }
}
