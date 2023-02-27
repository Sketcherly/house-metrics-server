package li.dongpo.house.metrics.service;

import li.dongpo.house.metrics.domain.DeviceMetrics;
import li.dongpo.house.metrics.repository.DeviceMetricsRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dongpo.li
 * @date 2022/9/22
 */
@Service
public class DeviceMetricsService {

    @Resource
    private DeviceMetricsRepository deviceMetricsRepository;

    public int postMetrics(DeviceMetrics metrics) {
        return deviceMetricsRepository.insert(metrics);
    }

}
