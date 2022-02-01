package com.trackenshure.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sergey Klunniy
 */
@Configuration
@ComponentScan(basePackages = {
        "com.trackenshure.dao",
        "com.trackenshure.service"
})
public class AppConfig {
}
