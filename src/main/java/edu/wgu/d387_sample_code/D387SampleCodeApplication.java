package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.language.SearchBundle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class D387SampleCodeApplication {
	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		SearchBundle searchBundle = new SearchBundle();

		try {
			InputStream inputStream = new ClassPathResource("welcome_CA.properties").getInputStream();
			String[] welcomeMessages = searchBundle.getWelcomeMessage(inputStream);
				for(String message : welcomeMessages) {
					System.out.println(message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			InputStream inputStream = new ClassPathResource("welcome_en_US.properties").getInputStream();
			String[] welcomeMessages = searchBundle.getWelcomeMessage(inputStream);
				for(String message : welcomeMessages) {
					System.out.println(message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
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
