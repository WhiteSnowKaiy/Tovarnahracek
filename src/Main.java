import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
Material material = new Material();
Soucastky soucastky = new Soucastky();
            Scanner sc=new Scanner(System.in);
          /*  System.out.println("Kolik chcte vytvořit panenek");
            int maxpanenek=sc.nextInt();*/
            soucastky.zadost();
            Dstvoritel steve =new Dstvoritel("STEVE",material,soucastky);
            Dstvoritel steve5 =new Dstvoritel("STEVE5",material,soucastky);
            Dstvoritel steve69 =new Dstvoritel("STEVE69",material,soucastky);

        ArrayList<Thread> pole=new ArrayList();
        pole.add(new Dhlava("Pepa",material,soucastky));
        pole.add(new Dtelo("Karel",material,soucastky));
        pole.add(new Druce("Kuba",material,soucastky));
        pole.add(new Dnohy("Petr",material,soucastky));
        pole.add(new Ddodavatel("dodavatel",material,soucastky));
        pole.add(steve);
        pole.add(steve5);
        pole.add(steve69);


        for (int i = 0; i < pole.size(); i++) {
                pole.get(i).start();
        }
        for (int i = 0; i < pole.size(); i++) {
                pole.get(i).join();
        }

            Dstvoritel zamestnanecsnejvicepanenkami = steve69;
        if (steve.getVytvoreni_panenky()>zamestnanecsnejvicepanenkami.getVytvoreni_panenky()){
                zamestnanecsnejvicepanenkami=steve;
        }
        if (steve5.getVytvoreni_panenky()>zamestnanecsnejvicepanenkami.getVytvoreni_panenky()){
                zamestnanecsnejvicepanenkami=steve5;
        }


        System.out.println("Celkem se vyrobilo hlav "+soucastky.getCelkem_vyrobeno_hlav());
        System.out.println("Celkem se vyrobilo těl "+soucastky.getCelkem_vyrobeno_telo());
        System.out.println("Celkem se vyrobilo ruk "+soucastky.getCelkem_vyrobeno_ruce());
        System.out.println("Celkem se vyrobilo noh "+soucastky.getCelkem_vyrobeno_noh());
        System.out.println("Celkem se vyrobilo panenek "+soucastky.getCelkem_vyrobeno_panenek());
            System.out.println("Zaměstnanec který vytvořil nejvíce panenenk je "+zamestnanecsnejvicepanenkami.getJmeno() +" a vytvořil "+zamestnanecsnejvicepanenkami.getVytvoreni_panenky());
        System.out.println("Zbylo plastu "+material.getPlast());
        System.out.println("Zbylo sad vlasů "+material.getVlasy());


    }
}