public class Main {
    public static void main(String[] args) {
        Lampadina l = new Lampadina();
        l.accendi();
        l.setNome("camera");
        l.setColore("giallo");
        l.diminusiciIlluminazione();
        System.out.println(l.toString());
    }
}