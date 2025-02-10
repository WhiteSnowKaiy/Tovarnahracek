public class Soucastky {
    private int hlava;
    private int telo;
    private int ruce;
    private int nohy;
    private int panenka;

    public void addhlava(){
        hlava++;
    }
    public void addtelo(){
        telo++;
    }
    public void addruce(){
        ruce++;
    }
    public void addnohy(){
        nohy++;
    }
    public void addpanenka(){
        panenka++;
    }

    public void vytvorenipanenky() throws InterruptedException {
        hlava--;
        telo--;
        ruce--;
        nohy--;
        addpanenka();

    }

    public int getHlava() {
        return hlava;
    }

    public int getTelo() {
        return telo;
    }

    public int getRuce() {
        return ruce;
    }

    public int getNohy() {
        return nohy;
    }

    public int getPanenka() {
        return panenka;
    }
}
