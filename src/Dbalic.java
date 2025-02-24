public class Dbalic extends Delnik {

    @Override
    public void run() {
        while (getSoucatsky().maximalnipocetpanenek()){
            if (getSoucatsky().getCelkem_vyrobeno_panenek() >= getSoucatsky().getMax()){
                System.out.println("Vsechny hracky zabalene");
            }
            if (super.getKarton() < 10){
                System.out.println("Dosel karton!");
            }
            super.odeberKarton();
            getSoucatsky().addCelkemZabalenePanenky();
            System.out.println("Hracka zabalena");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Dbalic(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
}
