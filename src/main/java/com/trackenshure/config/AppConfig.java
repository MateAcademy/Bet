package com.trackenshure.config;

import com.trackenshure.dao.UserDao;
import com.trackenshure.service.UserService;
import com.trackenshure.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
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
