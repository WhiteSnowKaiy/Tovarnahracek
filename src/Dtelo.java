public class Dtelo extends Delnik{
    public Dtelo(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }

    private final int POCET_PLASTU=50;
    @Override
    public void run() {
        while (true){
            System.out.println("Začína vyrábět tělo "+super.getJmeno());
            while (!super.getMaterial().uberplast(POCET_PLASTU)){
                System.out.println("Čeká na material");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            getSoucatsky().addtelo();
            System.out.println("Dokončil tělo");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
