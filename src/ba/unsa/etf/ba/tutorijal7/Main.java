package ba.unsa.etf.ba.tutorijal7;

public class Main {
    private static Sat s = new Sat(15,30,45);

    public static void main(String[] args) {
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0,0,0);
        s.Ispisi();
    }
}
