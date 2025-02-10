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

        for (int i = 0; i < pole.size(); i++) {
            pole.get(i).start();
        }
        for (int i = 0; i < pole.size(); i++) {
            pole.get(i).join();
        }
    }
}