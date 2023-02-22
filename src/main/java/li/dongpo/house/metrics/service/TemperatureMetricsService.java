package li.dongpo.house.metrics.service;

import li.dongpo.house.metrics.domain.TemperatureMetrics;
import li.dongpo.house.metrics.repository.TemperatureMetricsRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dongpo.li
 * @date 2022/9/22
 */
@Service
public class TemperatureMetricsService {

    @Resource
    private TemperatureMetricsRepository temperatureMetricsRepository;

    public int postMetrics(TemperatureMetrics metrics) {
        return temperatureMetricsRepository.insert(metrics);
    }

}
