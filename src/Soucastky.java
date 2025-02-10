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

    public void  vytvorenipanenky() throws InterruptedException {
        hlava--;
        telo--;
        ruce--;
        nohy--;
        addpanenka();
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
}
