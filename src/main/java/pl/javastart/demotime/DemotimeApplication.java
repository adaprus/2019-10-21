package pl.javastart.demotime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.*;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class DemotimeApplication {


//    public static void main(String[] args) {
//        System.out.println("Dzień:" + LocalDate.now());
//        System.out.println("Godzina:" + LocalTime.now());
//        System.out.println("Godzina:" + LocalDateTime.now());

//        LocalDate data = LocalDate.of(2018, 1 , 12);
//        LocalTime godzina = LocalTime.of(12, 13);
//        LocalDateTime dataIgodzina = LocalDateTime.of(data, godzina);
//
//        Duration duration = Duration.between(dataIgodzina, LocalDateTime.now());
//        System.out.println("Days: " + duration.toDays());
//        System.out.println("Hours: " + duration.toHours());
//
//        Period between = Period.between(data, LocalDate.now());
//
//        System.out.println("Dni: " + between.getDays());

//
//        System.out.println(data);
//        System.out.println(godzina);
//        System.out.println(dataIgodzina);
//
//        String dateString = "2018/02/02";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/dd/MM");
//
//        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
//
//
//    }

    public static void main(String[] args) {
        SpringApplication.run(DemotimeApplication.class, args);
    }

//    public static void main(String[] args) {
//        System.out.println(LocalDateTime.now());
//        System.out.println(Instant.now());
//        System.out.println(ZonedDateTime.now());
//
//
//
//    }

}
