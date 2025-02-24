public class Dtelo extends Delnik{
    private int pocetVyrobenychKusu = 0;
    int getPocetVyrobenychKusu() {
        return pocetVyrobenychKusu;
    }
    private final int POCET_PLASTU=50;

    @Override
    public void run() {
        while (getSoucatsky().maximalnipocetpanenek()){
            if (getSoucatsky().getMax()*2 <= getSoucatsky().getTelo()){
                System.out.println("Delnik vytvořil dostatek součástek - Zastavuji");
                return;
            }
            System.out.println("Začína vyrábět tělo "+super.getJmeno());
            while (!super.getMaterial().uberplast(POCET_PLASTU)){
                System.out.println("Čeká na material "+super.getJmeno());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            getSoucatsky().addtelo();
            pocetVyrobenychKusu++;
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Dokončil tělo("+getSoucatsky().getTelo() +")");
        }
        System.out.println(getJmeno() + " vytvořil " + getPocetVyrobenychKusu() + " kusů");
    }

    public Dtelo(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
}
