public class Dhlava extends Delnik{


    public Dhlava(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
        private final int POCET_PLASTU=10;
    private final int POCET_VLASU=2;
    @Override
    public void run() {
        while (true){
            System.out.println("Začína vyrábět hlavu "+super.getJmeno());
            while (!super.getMaterial().uberplast(POCET_PLASTU)&& !super.getMaterial().ubervlasy(POCET_VLASU)){
                System.out.println("Čeká na material");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            getSoucatsky().addhlava();
            System.out.println("Dokončil hlavu");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
