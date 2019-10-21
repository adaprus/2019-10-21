package pl.javastart.demotime.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/togo")
    @ResponseBody
    public String  getTime(@RequestParam String date,
                                 @RequestParam long hours) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
        ZoneId zoneId= ZoneId.of("Europe/Warsaw");

        ZonedDateTime start = ZonedDateTime.of(localDateTime, zoneId);
        ZonedDateTime zonedDateTime= ZonedDateTime.of(localDateTime, zoneId);


        LocalDateTime localDateTimeToGo = localDateTime.plusHours(hours);

        ZonedDateTime zonedDateTime1 = start.plusHours(12);

        String format = localDateTimeToGo.format(formatter1);


        return "Skończysz pracę: " + format
                + " lub " + zonedDateTime1;

    }

}
