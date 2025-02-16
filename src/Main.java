import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
Material material = new Material();
Soucastky soucastky = new Soucastky();
        ArrayList<Thread> pole=new ArrayList();
        pole.add(new Dhlava("Pepa",material,soucastky));
        pole.add(new Dtelo("Karel",material,soucastky));
        pole.add(new Druce("Kuba",material,soucastky));
        pole.add(new Dnohy("Petr",material,soucastky));
        pole.add(new Dstvoritel("STEVE",material,soucastky));
        pole.add(new Dstvoritel("STEVE5",material,soucastky));
        pole.add(new Dstvoritel("STEVE69",material,soucastky));
        pole.add(new Ddodavatel("dodavatel",material,soucastky));
        for (int i = 0; i < pole.size(); i++) {
            pole.get(i).start();
        }
        for (int i = 0; i < pole.size(); i++) {
            pole.get(i).join();
        }

        System.out.println("Celkem se vyrobilo hlav "+soucastky.getCelkem_vyrobeno_hlav());
        System.out.println("Celkem se vyrobilo těl "+soucastky.getCelkem_vyrobeno_telo());
        System.out.println("Celkem se vyrobilo ruk "+soucastky.getCelkem_vyrobeno_ruce());
        System.out.println("Celkem se vyrobilo noh "+soucastky.getCelkem_vyrobeno_noh());
        System.out.println("Celkem se vyrobilo panenek "+soucastky.getCelkem_vyrobeno_panenek());
        System.out.println("Zbylo plastu "+material.getPlast());
        System.out.println("Zbylo sad vlasů "+material.getVlasy());


    }
}