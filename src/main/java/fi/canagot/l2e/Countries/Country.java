package fi.canagot.l2e.Countries;

public class Country implements iCountry{
    private String strName="";
    private String strLeader="";
    private String strPopulation="";
    public Country(String strInLeader, String strInPopulation) {
        this.strLeader=strInLeader;
        this.strPopulation=strInPopulation;
    }
    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrLeader() {
        return strLeader;
    }

    public void setStrLeader(String strLeader) {
        this.strLeader = strLeader;
    }

    public String getStrPopulation() {
        return strPopulation;
    }

    public void setStrPopulation(String strPopulation) {
        this.strPopulation = strPopulation;
    }
}
