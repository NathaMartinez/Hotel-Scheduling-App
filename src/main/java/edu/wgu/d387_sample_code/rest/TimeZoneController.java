package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.convertor.TimeZoneConverter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/api/time-zone")
public class TimeZoneController {

    @GetMapping("/time")
    public String[] getTimeZone() throws IOException {
        TimeZoneConverter timeZoneConverter = new TimeZoneConverter();
    return timeZoneConverter.getTimeZone();


    }
}
