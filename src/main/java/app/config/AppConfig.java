package app.config;

import app.model.Timer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    
    public Timer getTimer() {
        Timer timer = new Timer();
        timer.getTime();
        return timer;
    }
}
