package service;

import entity.RainQuality;

import java.util.List;

public interface RainQualityService {
    List<RainQuality> getAllRainQuality();
    void  AddRainQuality(RainQuality rainQuality);
}
