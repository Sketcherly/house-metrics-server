package li.dongpo.house.metrics.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author dongpo.li
 * @date 2022/10/9
 */
public class DeviceMetricsRequestDto {

    private String deviceId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date metricTime;
    /**
     * T 温度
     * AH 空气湿度
     * SH 土壤湿度
     */
    private String metricType;
    private BigDecimal metricValue;

    // TODO
    private BigDecimal temperature;

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

    public String getMetricType() {
        return metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public BigDecimal getMetricValue() {
        return metricValue;
    }

    public void setMetricValue(BigDecimal metricValue) {
        this.metricValue = metricValue;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }
}
