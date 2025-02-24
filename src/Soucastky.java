import java.util.Scanner;

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
    private int CelkemZabalenePanenky;
    private int max;                            // Kolik panenek chce uzivatel

    Scanner sc=new Scanner(System.in);

    public void addhlava(){
        hlava++;
        celkem_vyrobeno_hlav++;
    }
    public void addCelkemZabalenePanenky(){
        CelkemZabalenePanenky++;
    }
    public void addtelo(){
        telo++;
        celkem_vyrobeno_telo++;
    }
    public void addruce(){
        ruce=ruce+2;
        celkem_vyrobeno_ruce=celkem_vyrobeno_ruce+2;
    }
    public void addnohy(){
        nohy=nohy+2;
        celkem_vyrobeno_noh=celkem_vyrobeno_noh+2;
    }
    public void addpanenka(){
        panenka++;
        celkem_vyrobeno_panenek++;
    }

    public synchronized void  vytvorenipanenky() throws InterruptedException {
        hlava--;
        telo--;
        ruce=ruce-2;
        nohy=nohy-2;
        addpanenka();
    }


    public final int zadost(){
        System.out.println("Kolik chcte vytvořit panenek");
        max=sc.nextInt();
        return max;
    }

    public boolean maximalnipocetpanenek(){
        if (getCelkem_vyrobeno_panenek()<getMax()){
           return true;
        }
        return false;
    }
    public boolean zabalenePanenky(){
        if (CelkemZabalenePanenky<getMax()){
            return true;
        }
        return false;
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

    public int getMax() {
        return max;
    }

    public synchronized int getCelkem_vyrobeno_hlav() {
        return celkem_vyrobeno_hlav;
    }

    public synchronized int getCelkem_vyrobeno_telo() {
        return celkem_vyrobeno_telo;
    }

    public synchronized int getCelkem_vyrobeno_ruce() {
        return celkem_vyrobeno_ruce;
    }

    public synchronized int getCelkem_vyrobeno_noh() {
        return celkem_vyrobeno_noh;
    }

    public synchronized int getCelkem_vyrobeno_panenek() {
        return celkem_vyrobeno_panenek;
    }
    public synchronized int getCelkemZabalenePanenky() {
        return CelkemZabalenePanenky;
    }
}
