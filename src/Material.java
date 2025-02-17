import java.util.Random;

public class Material {
    private int plast=10000;
    private int vlasy=1000;
    Random random = new Random();

    public synchronized boolean uberplast(int pocet) {
        if (getPlast() >= pocet) {
            plast=plast-pocet;
            return true;
        }
        return false;
    }

    public synchronized boolean ubervlasy(int pocet) {
        if (getVlasy() >= pocet) {
            vlasy=vlasy-pocet;
            return true;
        }
        return false;
    }

    public void pridatplast(){
        plast=plast+random.nextInt(1000+1);
    }
    public void pridavlasy(){
        vlasy=vlasy+random.nextInt(100+1);
    }

    public int getPlast() {
        return plast;
    }

    public int getVlasy() {
        return vlasy;
    }
}
