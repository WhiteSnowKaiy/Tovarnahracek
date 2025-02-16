public class Dtelo extends Delnik{
    public Dtelo(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }

    private final int POCET_PLASTU=50;
    @Override
    public void run() {
        while (getSoucatsky().maximalnipocetpanenek()){
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
            System.out.println("Dokončil tělo("+getSoucatsky().getTelo() +")");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
