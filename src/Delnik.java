public class Delnik extends Thread {

    private String jmeno;
    private Soucastky Soucatsky;
    private Material Material;
    private int karton = 600;

    public Delnik(String jmeno, Material material, Soucastky soucatsky) {
        this.jmeno = jmeno;
        Material = material;
        Soucatsky = soucatsky;
    }

    public Soucastky getSoucatsky() {
        return Soucatsky;
    }

    public Material getMaterial() {
        return Material;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getKarton() {
        return karton;
    }
    public void odeberKarton() {
        karton = karton - 10;
    }
}
