package model;

public class Currency {
    private int countryCode;
    private String fullName;
    private String shortName;

    public int getCountryCode() {
        return countryCode;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public Currency(int countryCode, String fullName, String shortName) {
        this.countryCode = countryCode;
        this.fullName = fullName;
        this.shortName = shortName;
    }
}
