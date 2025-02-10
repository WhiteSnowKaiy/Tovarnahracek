public class Soucastky {
    private int hlava;
    private int telo;
    private int ruce;
    private int nohy;

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

    public void vytvorenipanenky(){
       if (getHlava()>0 && getTelo()>0 && getRuce()>0 && getNohy()>0){
           hlava--;
           telo--;
           ruce--;
           nohy--;
           System.out.println("Panenka je postavena");
       }
        System.out.println("Nejsou soucastky");
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
}
