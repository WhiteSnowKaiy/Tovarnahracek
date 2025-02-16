public class Material {
    private int plast=10000;
    private int vlasy=1000;

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
        plast=plast+550;
    }
    public void pridavlasy(){
        vlasy=vlasy+6;
    }

    public int getPlast() {
        return plast;
    }

    public int getVlasy() {
        return vlasy;
    }
}
