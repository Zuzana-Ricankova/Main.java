import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ListOfSellers firstSeller = new ListOfSellers();
        ListOfSellers secondSeller = new ListOfSellers();
        ListOfSellers thirdSeller = new ListOfSellers();


        firstSeller.setName("Nina Veselá");
        secondSeller.setName("Erik Hrubý");
        thirdSeller.setName("Mirka Krotká");


        firstSeller.setDateOfBirth(LocalDate.of(1980,7,12));
        secondSeller.setDateOfBirth(LocalDate.of(1994,3,6));
        thirdSeller.setDateOfBirth(LocalDate.of(1975,9,8));


        firstSeller.setContracts(BigDecimal.valueOf(8));
        secondSeller.setContracts(BigDecimal.valueOf(5));
        thirdSeller.setContracts(BigDecimal.valueOf(3));


        firstSeller.setCarrots(BigDecimal.valueOf(8));
        secondSeller.setCarrots(BigDecimal.valueOf(5));
        thirdSeller.setCarrots(BigDecimal.valueOf(3));


        firstSeller.setTown("Brno");
        secondSeller.setTown("Praha");
        thirdSeller.setTown("Brno");


        firstSeller.setSpz("7C2 5025");
        secondSeller.setSpz("M33 3333");
        thirdSeller.setSpz("I11 1111");


        //car consumption in l/100 km
        firstSeller.setCarConsumption(6);
        secondSeller.setCarConsumption(8.5);
        thirdSeller.setCarConsumption(10);


        firstSeller.setIpAdress("192.168.0.2");
        secondSeller.setIpAdress("186.169.0.5");
        thirdSeller.setIpAdress("176.168.0.8");


        BigDecimal allCarrots = (firstSeller.carrots.add(secondSeller.carrots))
                                    .add(thirdSeller.carrots);
        BigDecimal allContracts = (firstSeller.contracts.add(secondSeller.contracts))
                                    .add(thirdSeller.contracts);
        BigDecimal result = allCarrots.divide(allContracts);


        System.out.println("The average quantity of carrots sold per contract is "
                + result + " tonne.");




    }
}
