package li.dongpo.house.metrics.controller;

import li.dongpo.house.metrics.domain.Device;
import li.dongpo.house.metrics.domain.DeviceMetrics;
import li.dongpo.house.metrics.domain.vo.BasicResponseObject;
import li.dongpo.house.metrics.dto.DeviceMetricsRequestDto;
import li.dongpo.house.metrics.service.DeviceMetricsService;
import li.dongpo.house.metrics.service.DeviceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dongpo.li
 * @date 2022/9/22
 */
@RestController
@RequestMapping("/device/metrics")
public class DeviceMetricsController {

    @Resource
    private DeviceMetricsService deviceMetricsService;
    @Resource
    private DeviceService deviceService;

    @PostMapping("/postMetrics")
    public BasicResponseObject<?> postMetrics(@RequestBody DeviceMetricsRequestDto requestDto) {

        DeviceMetrics metrics = new DeviceMetrics();

        String deviceId = requestDto.getDeviceId();
        Device device = deviceService.selectByDeviceId(deviceId);
        if (device != null) {
            metrics.setHouseId(device.getHouseId());
        } else {
            metrics.setHouseId("");
        }

        metrics.setDeviceId(requestDto.getDeviceId());
        metrics.setMetricTime(requestDto.getMetricTime());
        metrics.setMetricType(requestDto.getMetricType());
        metrics.setMetricValue(requestDto.getMetricValue());

        deviceMetricsService.postMetrics(metrics);

        return BasicResponseObject.ok(true);
    }

}
