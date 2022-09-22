package li.dongpo.green.house.metrics.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("li.dongpo.green.house.metrics.repository")
public class MybatisConfiguration {

}
