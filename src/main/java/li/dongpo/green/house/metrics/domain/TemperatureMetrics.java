package li.dongpo.green.house.metrics.domain;

import java.math.BigDecimal;

/**
 * @author dongpo.li
 * @date 2022/9/22
 */
public class TemperatureMetrics extends BaseEntity {

    private String houseId;
    private String deviceId;
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

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }
}
