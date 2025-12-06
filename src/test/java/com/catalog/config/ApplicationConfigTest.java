package com.catalog.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ApplicationConfigTest {

    @Autowired
    private ApplicationConfig applicationConfig;

    @Test
    void testCorsConfigurerBean() {
        // Verifies CORS configurer bean is created successfully
        WebMvcConfigurer corsConfigurer = applicationConfig.corsConfigurer();
        assertNotNull(corsConfigurer);
    }

}