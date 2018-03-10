package service.impl;

import entity.RainQuality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.RainQualityRepository;
import service.RainQualityService;

import java.util.List;
@Service

public class RainQualityServiceImpl implements RainQualityService {
    @Autowired
    private RainQualityRepository rainQualityRepository;
    @Override
    public List<RainQuality> getAllRainQuality() {
        return rainQualityRepository.getAllRainQuality();
    }

    @Override
    public void AddRainQuality(RainQuality rainQuality) {

    }



}
