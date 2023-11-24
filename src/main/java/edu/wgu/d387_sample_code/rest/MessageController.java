package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.language.GetWelcomeMessages;
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

    @GetMapping("/welcome")
    public String[] getWelcomeMessage() throws IOException {
        GetWelcomeMessages getWelcomeMessages = new GetWelcomeMessages();
        InputStream inputStreamFR = new ClassPathResource("welcome_CA.properties").getInputStream();
        InputStream inputStreamEN = new ClassPathResource("welcome_en_US.properties").getInputStream();
        return getWelcomeMessages.getWelcomeMessage(inputStreamFR,inputStreamEN);
    }
}
