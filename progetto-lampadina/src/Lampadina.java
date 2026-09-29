public class Lampadina {
    int potenza;
    int illuminazione;
    String colore;
    String nome;
    String stato;
    public Lampadina( ){
        this.potenza = 40;
        this.illuminazione = 50;
        this.colore = "bianco";
        this.nome = "";
        this.stato = "spento";

    }

    public Lampadina(Lampadina l){
        this.potenza = l.potenza;
        this.illuminazione = l.illuminazione;
        this.colore = l.colore;
        this.stato = l.stato;
        this.nome = l.nome;
}
}