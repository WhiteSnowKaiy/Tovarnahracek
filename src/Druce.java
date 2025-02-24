public class Druce extends Delnik{
    private final int POCET_PLASTU=20*2;
    private int pocetVyrobenychKusu = 0;
    int getPocetVyrobenychKusu() {
        return pocetVyrobenychKusu;
    }

    @Override
    public void run() {
        while (getSoucatsky().maximalnipocetpanenek()){
            if (getSoucatsky().getMax()*2 <= getSoucatsky().getRuce()){
                System.out.println("Delnik vytvořil dostatek součástek - Zastavuji");
                return;
            }
            System.out.println("Začína vyrábět ruce "+super.getJmeno());
            while (!super.getMaterial().uberplast(POCET_PLASTU)){
                System.out.println("Čeká na material "+super.getJmeno());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            getSoucatsky().addruce();
            pocetVyrobenychKusu++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Dokončil ruce("+getSoucatsky().getRuce() +")");
        }
        System.out.println(getJmeno() + " vytvořil " + getPocetVyrobenychKusu() + " kusů");
    }

    public Druce(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
}
