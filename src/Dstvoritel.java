public class Dstvoritel extends Delnik{
    public Dstvoritel(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
    private final int POCET_PLASTU=20;
    @Override
    public void run() {
        while (getSoucatsky().maximalnipocetpanenek()){
            System.out.println("Začína vyrábět panenku "+super.getJmeno());
            try {
                if (getSoucatsky().getHlava()>0 && getSoucatsky().getTelo()>0
                    && getSoucatsky().getRuce()>0 && getSoucatsky().getNohy()>0){
                    System.out.println("Panenka je postavena"+getJmeno());
                    getSoucatsky().vytvorenipanenky();
                }else {System.out.println("Nejsou soucastky pro panenku") ;
                    Thread.sleep(1000);;
                }
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
