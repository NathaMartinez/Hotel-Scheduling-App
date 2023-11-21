package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.language.SearchBundle;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@CrossOrigin
@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @GetMapping("/welcome-fr")
    public String[] getWelcomeMessageFR() throws IOException {
        SearchBundle searchBundle = new SearchBundle();
        InputStream inputStream = new ClassPathResource("welcome_CA.properties").getInputStream();
        return searchBundle.getWelcomeMessage(inputStream);

    }
    @GetMapping("/welcome-en")
    public String[] getWelcomeMessageEN() throws IOException {
        SearchBundle searchBundle = new SearchBundle();
        InputStream inputStream = new ClassPathResource("welcome_en_US.properties").getInputStream();
        return searchBundle.getWelcomeMessage(inputStream);

    }

}
