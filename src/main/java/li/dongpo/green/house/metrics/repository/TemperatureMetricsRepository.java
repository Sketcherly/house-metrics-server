package li.dongpo.green.house.metrics.repository;

import li.dongpo.green.house.metrics.domain.TemperatureMetrics;
import org.springframework.stereotype.Repository;

/**
 * @author dongpo.li
 * @date 2022/9/22
 */
@Repository
public interface TemperatureMetricsRepository {

    int insert(TemperatureMetrics metrics);

}
