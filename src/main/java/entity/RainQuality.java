package entity;

import java.util.Date;

public class RainQuality {
    private int id;
    private String districtName;
    private Date monitorTime;
    private int rain;
    private String monitoringStation;
    private String monitoringAddress;

    @Override
    public String toString() {
        return "RainQuality{" +
                "id=" + id +
                ", districtName='" + districtName + '\'' +
                ", monitorTime=" + monitorTime +
                ", rain=" + rain +
                ", monitoringStation='" + monitoringStation + '\'' +
                ", monitoringAddress='" + monitoringAddress + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public int getRain() {
        return rain;
    }

    public void setRain(int rain) {
        this.rain = rain;
    }

    public String getMonitoringStation() {
        return monitoringStation;
    }

    public void setMonitoringStation(String monitoringStation) {
        this.monitoringStation = monitoringStation;
    }

    public String getMonitoringAddress() {
        return monitoringAddress;
    }

    public void setMonitoringAddress(String monitoringAddress) {
        this.monitoringAddress = monitoringAddress;
    }

    public RainQuality(String districtName, Date monitorTime, int rain, String monitoringStation, String monitoringAddress) {

        this.districtName = districtName;
        this.monitorTime = monitorTime;
        this.rain = rain;
        this.monitoringStation = monitoringStation;
        this.monitoringAddress = monitoringAddress;
    }

    public RainQuality(int id, String districtName, Date monitorTime, int rain, String monitoringStation, String monitoringAddress) {

        this.id = id;
        this.districtName = districtName;
        this.monitorTime = monitorTime;
        this.rain = rain;
        this.monitoringStation = monitoringStation;
        this.monitoringAddress = monitoringAddress;
    }

    public RainQuality() {

    }
}
