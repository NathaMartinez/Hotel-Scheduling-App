package edu.wgu.d387_sample_code.convertor;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneConverter {
    public String[] getTimeZone() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm a");

        ZoneId zEastern = ZoneId.of("America/New_York");
        ZoneId zMountain = ZoneId.of("America/Phoenix");
        ZoneId zUniversal = ZoneId.of("UTC");
        ZoneId zoneId = ZoneId.systemDefault();

        //Set Local Time to specific time
        LocalDateTime localDateTime = LocalDateTime.now().toLocalDate().atTime(11, 0);
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);

        //Eastern Time (ET)
        ZonedDateTime zonedDateTimeEastern = zonedDateTime.withZoneSameInstant(zEastern);
        LocalDateTime localDateTimeEastern = zonedDateTimeEastern.toLocalDateTime();

        //Mountain Time (MT)
        ZonedDateTime zonedDateTimeMountain = zonedDateTime.withZoneSameInstant(zMountain);
        LocalDateTime localDateTimeMountain = zonedDateTimeMountain.toLocalDateTime();

        //Universal Time (UTC)
        ZonedDateTime zonedDateTimeUTC = zonedDateTime.withZoneSameInstant(zUniversal);
        LocalDateTime localDateTimeUTC = zonedDateTimeUTC.toLocalDateTime();

        //Format Strings
        String formattedTimeEastern = localDateTimeEastern.format(fmt);
        String formattedTimeMountain = localDateTimeMountain.format(fmt);
        String formattedTimeUTC = localDateTimeUTC.format(fmt);
        String formattedLocalTime = localDateTime.format(fmt);

        //Concatenate String
        String presentationMessage = "Join us for an online live presentation held at the Landon Hotel on December 1, 2023 at " + formattedTimeEastern + " Eastern Time | " + formattedTimeMountain + " Mountain Time | " + formattedTimeUTC + " UTC";
        return new String[]{presentationMessage};
    }
}
