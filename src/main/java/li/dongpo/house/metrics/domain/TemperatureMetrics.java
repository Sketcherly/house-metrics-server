package li.dongpo.house.metrics.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author dongpo.li
 * @date 2022/9/22
 */
public class TemperatureMetrics extends BaseEntity {

    private String houseId;
    private String deviceId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date metricTime;
    private BigDecimal temperature;

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Date getMetricTime() {
        return metricTime;
    }

    public void setMetricTime(Date metricTime) {
        this.metricTime = metricTime;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }
}
