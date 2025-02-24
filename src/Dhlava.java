import java.util.ArrayList;

public class Dhlava extends Delnik {
    private final int POCET_PLASTU=10;
    private final int POCET_VLASU=2;

    private int pocetVyrobenychKusu = 0;
    public int getPocetVyrobenychKusu() {
        return pocetVyrobenychKusu;
    }

    @Override
    public void run() {
        while (getSoucatsky().maximalnipocetpanenek()){
            if (getSoucatsky().getMax()*2 <= getSoucatsky().getHlava()){
                System.out.println("Delnik vytvořil dostatek součástek - Zastavuji");
                return;
            }
            System.out.println("Začína vyrábět hlavu "+super.getJmeno());
            while (!super.getMaterial().uberplast(POCET_PLASTU)){
                System.out.println("Čeká na material "+super.getJmeno());

                try { Thread.sleep(1000); }
                catch (InterruptedException e) { throw new RuntimeException(e); }
            }
            while (!super.getMaterial().ubervlasy(POCET_VLASU)){
                System.out.println("Čeká na material "+super.getJmeno());
                try { Thread.sleep(1000); }
                catch (InterruptedException e) { throw new RuntimeException(e);}
            }
            getSoucatsky().addhlava();
            pocetVyrobenychKusu++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Dokončil hlavu ("+getSoucatsky().getHlava() +")");
        }
        System.out.println(getJmeno() + " vytvořil " + getPocetVyrobenychKusu() + " kusů");
    }

    public Dhlava(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
}
