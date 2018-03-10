package repository;

import entity.RainQuality;

import java.util.List;

public interface RainQualityRepository {
    List<RainQuality> getAllRainQuality();
    void  AddRainQuality(RainQuality rainQuality);
}
