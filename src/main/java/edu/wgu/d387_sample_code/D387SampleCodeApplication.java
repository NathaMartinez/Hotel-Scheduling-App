package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.language.SearchBundle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@SpringBootApplication
public class D387SampleCodeApplication {
	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		SearchBundle searchBundle = new SearchBundle();

		try {
			InputStream inputStream = new ClassPathResource("welcome_CA.properties").getInputStream();
			InputStream inputStream2 = new ClassPathResource("welcome_en_US.properties").getInputStream();
			String[] welcomeMessages = searchBundle.getWelcomeMessage(inputStream, inputStream2);
				for(String message : welcomeMessages) {
					System.out.println(message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
/*
		ZoneId zEastern = ZoneId.of("America/New_York");
		ZoneId zPacific = ZoneId.of("America/Los_Angeles");
		ZoneId zUniversal = ZoneId.of("UTC");
		ZoneId zoneId = ZoneId.systemDefault();

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("local time " + localDateTime.toString());
		ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);

		ZonedDateTime zonedDateTimeEastern = zonedDateTime.withZoneSameInstant(zEastern);
		LocalDateTime localDateTimeEastern = zonedDateTimeEastern.toLocalDateTime();
		System.out.println("Eastern time " + localDateTimeEastern.toString());

		ZonedDateTime zonedDateTimePacific = zonedDateTime.withZoneSameInstant(zPacific);
		LocalDateTime localDateTimePacific = zonedDateTimePacific.toLocalDateTime();
		System.out.println("Pacific time " + localDateTimePacific.toString());

		ZonedDateTime zonedDateTimeUTC = zonedDateTime.withZoneSameInstant(zUniversal);
		LocalDateTime localDateTimeUTC = zonedDateTimeUTC.toLocalDateTime();
		System.out.println("UTC time " + localDateTimeUTC.toString());


 */



			/*
		Properties properties=new Properties();
		messageExecutor.execute(()-> {
			try {
				InputStream stream = new ClassPathResource("welcome_CA.properties").getInputStream();
				properties.load(stream);
				System.out.println(properties.getProperty("welcomeMessage"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		messageExecutor.execute(()-> {
			try {
				InputStream stream = new ClassPathResource("welcome_en_US.properties").getInputStream();
				properties.load(stream);
				System.out.println(properties.getProperty("welcomeMessage"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
			 */
	}
}
