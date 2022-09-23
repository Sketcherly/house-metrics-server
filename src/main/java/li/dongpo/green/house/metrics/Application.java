package li.dongpo.green.house.metrics;

import li.dongpo.green.house.metrics.constant.Constant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class Application {

	static {
		TimeZone.setDefault(TimeZone.getTimeZone(Constant.DEFAULT_ZONE_ID));
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
