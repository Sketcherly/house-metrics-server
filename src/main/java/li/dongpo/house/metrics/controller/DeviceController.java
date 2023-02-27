package li.dongpo.house.metrics.controller;

import li.dongpo.house.metrics.domain.Device;
import li.dongpo.house.metrics.domain.vo.BasicResponseObject;
import li.dongpo.house.metrics.service.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dongpo.li
 * @date 2023/2/27
 */
@RestController
@RequestMapping("/device")
public class DeviceController {
    private static final Logger logger = LoggerFactory.getLogger(DeviceController.class);

    @Resource
    private DeviceService deviceService;

    @GetMapping("/info")
    public BasicResponseObject<Device> info(String deviceId) {
        logger.info("设备信息查询，deviceId:{}", deviceId);
        Device device = deviceService.selectByDeviceId(deviceId);
        return BasicResponseObject.ok(device);
    }

    @PostMapping("/reboot")
    public BasicResponseObject<Boolean> reboot(String deviceId) {
        logger.info("设备重启，deviceId:{}", deviceId);
        deviceService.reboot(deviceId);
        return BasicResponseObject.ok(true);
    }

}
