import java.util.Random;

public class Ddodavatel extends Delnik{

    public Ddodavatel(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
    boolean b = true;

    @Override
    public void run() {
        while (getSoucatsky().maximalnipocetpanenek()) {

            if (getMaterial().getPlast() < 220){
                System.out.println("Začal dodávat plast pro panenky");
                getMaterial().pridatplast();
            }
            if (getMaterial().getVlasy() < 4){
                System.out.println("Začal dodávat vlasy pro panenku");
                getMaterial().pridavlasy();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
