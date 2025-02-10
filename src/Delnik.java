public class Delnik extends Thread {

    private String jmeno;
    private Soucastky Soucatsky;
    private Material Material;

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
}
