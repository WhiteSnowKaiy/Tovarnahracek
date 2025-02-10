public class Dstvoritel extends Delnik{
    public Dstvoritel(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
    private final int POCET_PLASTU=20;
    @Override
    public void run() {
        while (true){
            System.out.println("Začína vyrábět panenku "+super.getJmeno());
            try {
                getSoucatsky().vytvorenipanenky();
                System.out.println("Pocet panenek ("+getSoucatsky().getPanenka()+")");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
