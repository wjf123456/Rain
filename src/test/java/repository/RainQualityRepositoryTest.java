package repository;

import config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.RainQualityService;
import service.impl.RainQualityServiceImpl;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class RainQualityRepositoryTest {
@Autowired
    private RainQualityServiceImpl rainQualityService;
@Test
    public void test(){
    rainQualityService.getAllRainQuality().forEach(e->System.out.print(e));
}
}