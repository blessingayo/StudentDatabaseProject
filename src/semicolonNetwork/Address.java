package semicolonNetwork;

public class Address {


    private  String countryName;
    private  String cityName;
    private  String streetName;
    private  int houseNumber;

    public Address(String countryName, String cityName, String streetName, int houseNumber) {
        this.countryName = countryName;
        this.cityName = cityName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public void setCountryName() {
        countryName = countryName;
    }

    public String getCountryName() {
        return countryName;

    }

    public void setCityName() {
        cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setStreetName() {
        streetName = streetName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setHouseNumber() {
        houseNumber = houseNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }
}
