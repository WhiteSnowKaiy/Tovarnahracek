public class Dnohy extends Delnik{
    private int pocetVyrobenychKusu = 0;
    private final int POCET_PLASTU=30*2;

    int getPocetVyrobenychKusu() {
        return pocetVyrobenychKusu;
    }

    @Override
    public void run() {
        while (getSoucatsky().maximalnipocetpanenek()){
            if (getSoucatsky().getMax()*2 <= getSoucatsky().getNohy()){
                System.out.println("Delnik vytvořil dostatek součástek - Zastavuji");
                return;
            }
            System.out.println("Začína vyrábět nohy "+super.getJmeno());
            while (!super.getMaterial().uberplast(POCET_PLASTU)){
                System.out.println("Vyrobce čeka na material "+super.getJmeno());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            getSoucatsky().addnohy();
            pocetVyrobenychKusu++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Dokončil nohy("+getSoucatsky().getNohy() +")");
        }
        System.out.println(getJmeno() + " vytvořil " + getPocetVyrobenychKusu() + " kusů");
    }
    public Dnohy(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
}
