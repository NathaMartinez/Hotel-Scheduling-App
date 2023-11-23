package edu.wgu.d387_sample_code.language;

import org.springframework.data.repository.cdi.Eager;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneConverter {
    public String[] getTimeZone(){
        String[] timeZoneArray = new String[4];

        ZoneId zEastern = ZoneId.of("America/New_York");
        ZoneId zMountain = ZoneId.of("America/Phoenix");
        ZoneId zUniversal = ZoneId.of("UTC");
        ZoneId zoneId = ZoneId.systemDefault();

        //Local Time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("local time " + localDateTime.toString());
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);

        //Eastern Time (ET)
        ZonedDateTime zonedDateTimeEastern = zonedDateTime.withZoneSameInstant(zEastern);
        LocalDateTime localDateTimeEastern = zonedDateTimeEastern.toLocalDateTime();
        System.out.println("Eastern time " + localDateTimeEastern.toString());
        timeZoneArray[1] = String.valueOf(localDateTimeEastern);

        //Mountain Time (MT)
        ZonedDateTime zonedDateTimePacific = zonedDateTime.withZoneSameInstant(zMountain);
        LocalDateTime localDateTimePacific = zonedDateTimePacific.toLocalDateTime();
        System.out.println("Mountain time " + localDateTimePacific.toString());
        timeZoneArray[2] = String.valueOf(localDateTimePacific);

        //Universal Time (UTC)
        ZonedDateTime zonedDateTimeUTC = zonedDateTime.withZoneSameInstant(zUniversal);
        LocalDateTime localDateTimeUTC = zonedDateTimeUTC.toLocalDateTime();
        System.out.println("UTC time " + localDateTimeUTC.toString());
        timeZoneArray[3] = String.valueOf(localDateTimeUTC);

        return timeZoneArray;
    }
}
