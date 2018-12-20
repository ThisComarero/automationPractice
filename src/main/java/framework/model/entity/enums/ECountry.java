package framework.model.entity.enums;

public enum ECountry {
    OTHER("-"),
    UNITED_STATES("United States");

    String country;

    ECountry(String country) {this.country = country;}
    public String getValue(){return this.country;}

}
