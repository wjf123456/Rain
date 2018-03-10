package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc//引入SpringMvc
@ComponentScan("controller")
public class WebConfig extends WebMvcConfigurerAdapter{
//    @Bean
//    public ViewResolver viewResolver(){
//        InternalResourceViewResolver resolver=new InternalResourceViewResolver();
//        //resolver.setViewClass(JstView.class);
//        resolver.setPrefix("/WEB-INF/views/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
    @Bean
    public ViewResolver viewResolver(){
        return new TilesViewResolver();
    }

    @Bean
    public TilesConfigurer tilesConfigurer(){
        TilesConfigurer tiles=new TilesConfigurer();
        tiles.setDefinitions(new String[]{
                "/WEB-INF/layout/tiles.xml"
        });
        tiles.setCheckRefresh(true);
        return tiles;
    }

    @Override

    public  void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer
    ){configurer.enable();}
}
