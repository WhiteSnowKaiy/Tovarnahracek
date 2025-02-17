import java.util.Random;

public class Ddodavatel extends Delnik{

    public Ddodavatel(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
    boolean b = true;

    @Override
    public void run() {
        while (getSoucatsky().maximalnipocetpanenek()) {
                System.out.println("Začal dodávat plast pro panenky");
                getMaterial().pridatplast();


                System.out.println("Začal dodávat vlasy pro panenku");
                getMaterial().pridavlasy();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
