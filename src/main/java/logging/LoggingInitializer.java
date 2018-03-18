package logging;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.classic.Logger;
//import ch.qos.logback.contrib.json.classic.JsonLayout;
import ch.qos.logback.core.ConsoleAppender;

public class LoggingInitializer implements ApplicationContextInitializer
{

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {

      //  Logger logger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
       // ConsoleAppender ca = new ConsoleAppender<>();
      //  JsonLayout jl = new JsonLayout();

       // ca.setLayout(jl);
        //logger.addAppender(ca);
        //logger.debug("foo");
	}

}