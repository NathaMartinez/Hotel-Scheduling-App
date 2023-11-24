package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.language.GetWelcomeMessages;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class D387SampleCodeApplication {
	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		GetWelcomeMessages getWelcomeMessages = new GetWelcomeMessages();

		try {
			InputStream inputStream = new ClassPathResource("welcome_CA.properties").getInputStream();
			InputStream inputStream2 = new ClassPathResource("welcome_en_US.properties").getInputStream();
			String[] welcomeMessages = getWelcomeMessages.getWelcomeMessage(inputStream, inputStream2);
				for(String message : welcomeMessages) {
					System.out.println(message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
