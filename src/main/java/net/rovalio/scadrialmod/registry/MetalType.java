package net.rovalio.scadrialmod.registry;

public enum MetalType {
    IRON("Lurcher", "Skimmer", "iron"),
    STEEL("Coinshot", "Coinshot", "steel"),
    TIN("Tineye", "Windwhisperer", "tin"),
    PEWTER("Thug", "Brute", "pewter"),
    ZINC("Rioter", "Sparker", "zinc"),
    BRASS("Soother", "Firesoul", "brass"),
    COPPER("Smoker", "Archivist", "copper"),
    BRONZE("Seeker", "Sentry", "bronze"),
    CHROMIUM("Leecher", "Spinner", "chromium"),
    NICROSIL("Nicroburst", "Soulbearer", "nicrosil"),
    ALUMINIUM("Aluminium Gnat", "Trueself", "aluminium"),
    DURALUMIN("Duralumin Gnat", "Connector", "duralumin"),
    CADMIUM("Pulser", "Gasper", "cadmium"),
    BENDALLOY("Slider", "Subsumer", "bendalloy"),
    GOLD("Augur", "Bloodmaker", "gold"),
    ELECTRUM("Oracle", "Pinnacle", "electrum"),
    ATIUM("Seers", "Framer", "atium");

    private final String allomancyName;
    private final String feruchemyName;
    private final String allomanticMetal;

    MetalType(String allomancyName, String feruchemyName, String allomanticMetal) {
        this.allomancyName = allomancyName;
        this.feruchemyName = feruchemyName;
        this.allomanticMetal = allomanticMetal;
    }

    public String getAllomancyName() { return allomancyName; }
    public String getFeruchemyName() { return feruchemyName; }
    public String getAllomanticMetal() {return allomanticMetal; }


}

