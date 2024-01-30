import java.math.BigDecimal;
import java.time.LocalDate;

public class ListOfSellers {

    String name;
    LocalDate dateOfBirth;
    BigDecimal contracts;
    BigDecimal carrots;
    String town;
    String spz;
    double carConsumption;
    String ipAdress;

    //region all getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public BigDecimal getContracts() {
        return contracts;
    }

    public void setContracts(BigDecimal contracts) {
        this.contracts = contracts;
    }

    public BigDecimal getCarrots() {
        return carrots;
    }

    public void setCarrots(BigDecimal carrots) {
        this.carrots = carrots;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public double getCarConsumption() {
        return carConsumption;
    }

    public void setCarConsumption(double carConsumption) {
        this.carConsumption = carConsumption;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }


    //endregion all getters and setters



}
