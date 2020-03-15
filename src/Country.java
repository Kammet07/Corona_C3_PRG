public class Country {
    String name;
    float population;
    float infected;
    float dead;
    float cured;

    Country(String name, float population, float infected, float dead, float cured) {
        this.name = name;
        this.population = population;
        this.infected = infected;
        this.dead = dead;
        this.cured = cured;
    }

    public String getName() {
        return name;
    }

    public float getPopulation() {
        return population;
    }

    public float getInfected() {
        return infected;
    }

    public float getDead() {
        return dead;
    }

    public float getCured() {
        return cured;
    }

    public float getPercentInfected() {
        return infected * 100 / population;
    }

    public float getPercentDead() {
        return dead * 100 / infected;
    }
}
