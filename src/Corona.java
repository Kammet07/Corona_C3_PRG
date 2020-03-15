import java.util.LinkedList;

public class Corona {
    public static void main(String[] args) {
        Corona cr = new Corona();

        cr.run();
    }

    void run() {
        Country cz = new Country("Czechia", 10650000, 253, 0, 0);
        Country cn = new Country("China", 1386000000, 80849, 3199, 66931);
        Country it = new Country("Italy", 60480000, 24747, 1809, 2335);
        Country kr = new Country("South Korea", 51470000, 8162, 75, 834);
        Country ir = new Country("Iran", 81160000, 13938, 724, 4590);

        LinkedList<Country> countries = new LinkedList<>();

        countries.add(cz);
        countries.add(cn);
        countries.add(it);
        countries.add(kr);
        countries.add(ir);

        for (Country cntr : countries) {
            System.out.println(cntr.getName() + ":\n\tpopulation: " + cntr.getPopulation() + "\n\tinfected: " + cntr.getInfected() + "\n\tdeaf: " + cntr.getDead() + "\n\tcured: " + cntr.getCured() + "\n\tpercent infected: " + cntr.getPercentInfected() + "%\n\tpercent dead: " + cntr.getPercentDead() + "%");
        }
    }
}
