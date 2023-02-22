package li.dongpo.house.metrics.controller;

import li.dongpo.house.metrics.domain.TemperatureMetrics;
import li.dongpo.house.metrics.domain.vo.BasicResponseObject;
import li.dongpo.house.metrics.dto.TemperatureMetricsRequestDto;
import li.dongpo.house.metrics.service.TemperatureMetricsService;
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
@RequestMapping("/metrics/temperature")
public class TemperatureMetricsController {

    @Resource
    private TemperatureMetricsService temperatureMetricsService;

    @PostMapping("/postMetrics")
    public BasicResponseObject<?> postMetrics(@RequestBody TemperatureMetricsRequestDto requestDto) {

        TemperatureMetrics metrics = new TemperatureMetrics();
        metrics.setHouseId("");
        metrics.setDeviceId(requestDto.getDeviceId());
        metrics.setMetricTime(requestDto.getMetricTime());
        metrics.setTemperature(requestDto.getTemperature());

        temperatureMetricsService.postMetrics(metrics);

        return BasicResponseObject.ok(true);
    }

}
