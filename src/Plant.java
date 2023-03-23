public class Plant {

    private String species;
    private String speciesInLatin;
    private boolean isAnnual;
    private String continent;
    private int height;
    private boolean isEdible;

    public Plant() {
    }

    public Plant(String species, String speciesInLatin, boolean isAnnual, String continent, int height, boolean isEdible) {
        this.species = species;
        this.speciesInLatin = speciesInLatin;
        this.isAnnual = isAnnual;
        this.continent = continent;
        this.height = height;
        this.isEdible = isEdible;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpeciesInLatin() {
        return this.speciesInLatin;
    }

    public void setSpeciesInLatin(String speciesInLatin) {
        this.speciesInLatin = speciesInLatin;
    }

    public boolean getIsAnnual() {
        return this.isAnnual;
    }

    public void setAnnual(boolean isAnnual) {
        this.isAnnual = isAnnual;
    }

    public String getContinent() {
        return this.continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean getIsEdible() {
        return this.isEdible;
    }

    public void setEdible(boolean isEdible) {
        this.isEdible = isEdible;
    }


    @Override
    public String toString() {
        String annual = isAnnual ? "annual" : "not annual";
        String edibleOrNot = isEdible ? "edible" : "not edible";
        return ("Species- " + species + ",\n"
                + "Species in Latin- " + speciesInLatin +",\n"
                + "Is " + annual + ",\n"
                + "Continent- " + continent + ",\n"
                + "Height (cm)- " + height + ",\n"
                + "Is" + edibleOrNot + "\n");
    }
}

