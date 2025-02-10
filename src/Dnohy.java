public class Dnohy extends Delnik{
    public Dnohy(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }

    private final int POCET_PLASTU=30;
    @Override
    public void run() {
        while (true){
            System.out.println("Začína vyrábět nohy "+super.getJmeno());
            while (!super.getMaterial().uberplast(POCET_PLASTU)){
                System.out.println("Vyrobce čeka na material ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            getSoucatsky().addnohy();
            System.out.println("Dokončil nohy");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
