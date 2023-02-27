package li.dongpo.house.metrics.service;

import li.dongpo.house.metrics.domain.Device;
import li.dongpo.house.metrics.domain.DeviceMetrics;
import li.dongpo.house.metrics.repository.DeviceMetricsRepository;
import li.dongpo.house.metrics.repository.DeviceRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dongpo.li
 * @date 2022/9/22
 */
@Service
public class DeviceService {

    @Resource
    private DeviceRepository deviceRepository;

    public Device selectByDeviceId(String deviceId) {
        return deviceRepository.selectByDeviceId(deviceId);
    }

    public int reboot(String deviceId) {
        Device device = deviceRepository.selectByDeviceId(deviceId);
        return deviceRepository.reboot(device);
    }

}
