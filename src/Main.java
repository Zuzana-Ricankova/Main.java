import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ListOfSellers firstSeller = new ListOfSellers();
        ListOfSellers secondSeller = new ListOfSellers();
        ListOfSellers thirdSeller = new ListOfSellers();

        //region name settings
        firstSeller.setName("Nina Veselá");
        secondSeller.setName("Erik Hrubý");
        thirdSeller.setName("Mirka Krotká");
        //endregion name settings

        //region date of birth settings
        firstSeller.setDateOfBirth(LocalDate.of(1980,7,12));
        secondSeller.setDateOfBirth(LocalDate.of(1994,3,6));
        thirdSeller.setDateOfBirth(LocalDate.of(1975,9,8));
        //endregion date of birth settings


        //region number of contracts settings
        firstSeller.setContracts(BigDecimal.valueOf(8));
        secondSeller.setContracts(BigDecimal.valueOf(5));
        thirdSeller.setContracts(BigDecimal.valueOf(3));
        //endregion number of contracts settings

        //region number of carrots settings
        firstSeller.setCarrots(BigDecimal.valueOf(8));
        secondSeller.setCarrots(BigDecimal.valueOf(5));
        thirdSeller.setCarrots(BigDecimal.valueOf(3));
        //endregion number of carrots settings

        //region name of the town settings
        firstSeller.setTown("Brno");
        secondSeller.setTown("Praha");
        thirdSeller.setTown("Brno");
        //endregion name of the town settings

        //region SPZ settings
        firstSeller.setSpz("7C2 5025");
        secondSeller.setSpz("M33 3333");
        thirdSeller.setSpz("I11 1111");
        //endregion SPZ settings

        //region car consumption in l/100 km
        firstSeller.setCarConsumption(6);
        secondSeller.setCarConsumption(8.5);
        thirdSeller.setCarConsumption(10);
        //endregion car consumption in l/100 km

        //region IP adress settings
        firstSeller.setIpAdress("192.168.0.2");
        secondSeller.setIpAdress("186.169.0.5");
        thirdSeller.setIpAdress("176.168.0.8");
        //endregion IP adress settings


        BigDecimal allCarrots = (firstSeller.carrots.add(secondSeller.carrots))
                                    .add(thirdSeller.carrots);
        BigDecimal allContracts = (firstSeller.contracts.add(secondSeller.contracts))
                                    .add(thirdSeller.contracts);
        BigDecimal result = allCarrots.divide(allContracts);


        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je "
                + result + " tuna.");




    }
}