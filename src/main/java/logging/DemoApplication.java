package logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {


		SpringApplication application = new SpringApplication(DemoApplication.class);
		application.addInitializers(new LoggingInitializer());
		application.run(args);

	}
}
