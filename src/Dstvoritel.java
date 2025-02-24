import java.util.Random;


public class Dstvoritel extends Delnik{
    public Dstvoritel(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
    private final int POCET_PLASTU=20;
    Random random = new Random();
    int vytvoreni_panenky;


    public synchronized int getVytvoreni_panenky() {
        return vytvoreni_panenky;
    }

    @Override
    public void run() {
        while (getSoucatsky().maximalnipocetpanenek()){
            System.out.println("Začína vyrábět panenku "+super.getJmeno());
            try {
                if (getSoucatsky().getHlava()>0 && getSoucatsky().getTelo()>0
                        && getSoucatsky().getRuce()>=1 && getSoucatsky().getNohy()>=1){
                    System.out.println("Panenka je postavena "+getJmeno());

                    if (random.nextInt(100+1)<25){
                        System.out.println("Hračka je vadná");
                    }
                    else {
                        getSoucatsky().vytvorenipanenky();
                        vytvoreni_panenky++;

                    }


                } else {System.out.println("Nejsou soucastky pro panenku") ;
                    Thread.sleep(1000);;
                }
                System.out.println("Pocet panenek ("+getSoucatsky().getPanenka()+")");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
