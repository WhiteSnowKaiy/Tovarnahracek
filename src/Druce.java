public class Druce extends Delnik{
    public Druce(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
    private final int POCET_PLASTU=20*2;
    @Override
    public void run() {
        while (getSoucatsky().maximalnipocetpanenek()){
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
            System.out.println("Dokončil ruce("+getSoucatsky().getRuce() +")");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
