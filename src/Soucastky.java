public class Soucastky {
    private int hlava;
    private int celkem_vyrobeno_hlav;
    private int telo;
    private int celkem_vyrobeno_telo;
    private int ruce;
    private int celkem_vyrobeno_ruce;
    private int nohy;
    private int celkem_vyrobeno_noh;
    private int panenka;
    private int celkem_vyrobeno_panenek;

    public void addhlava(){hlava++;
    celkem_vyrobeno_hlav++;}
    public void addtelo(){
        telo++;
        celkem_vyrobeno_telo++;
    }
    public void addruce(){
        ruce++;
        celkem_vyrobeno_ruce++;
    }
    public void addnohy(){
        nohy++;
        celkem_vyrobeno_noh++;
    }
    public void addpanenka(){
        panenka++;
        celkem_vyrobeno_panenek++;
    }

    public synchronized void  vytvorenipanenky() throws InterruptedException {
        hlava--;
        telo--;
        ruce--;
        nohy--;
        addpanenka();
    }

    public boolean maximalnipocetpanenek(){
        if (getPanenka()<10){
           return true;
        }
        else {
            return false;
        }
    }

    public synchronized int getHlava() {
        return hlava;
    }

    public synchronized int getTelo() {
        return telo;
    }

    public synchronized int getRuce() {
        return ruce;
    }

    public synchronized int getNohy() {
        return nohy;
    }

    public synchronized int getPanenka() {
        return panenka;
    }

    public int getCelkem_vyrobeno_hlav() {
        return celkem_vyrobeno_hlav;
    }

    public int getCelkem_vyrobeno_telo() {
        return celkem_vyrobeno_telo;
    }

    public int getCelkem_vyrobeno_ruce() {
        return celkem_vyrobeno_ruce;
    }

    public int getCelkem_vyrobeno_noh() {
        return celkem_vyrobeno_noh;
    }

    public int getCelkem_vyrobeno_panenek() {
        return celkem_vyrobeno_panenek;
    }
}
