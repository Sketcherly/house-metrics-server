package li.dongpo.house.metrics.repository;

import li.dongpo.house.metrics.domain.Device;
import li.dongpo.house.metrics.domain.DeviceMetrics;
import org.springframework.stereotype.Repository;

/**
 * @author dongpo.li
 * @date 2022/9/22
 */
@Repository
public interface DeviceRepository {

    Device selectByDeviceId(String deviceId);

    int reboot(Device device);

}
