package com.catalog.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class AppPropertiesTest {

    @Autowired
    private AppProperties appProperties;

    @Test
    void testAppPropertiesLoaded() {
        // Verifies application properties are loaded from configuration
        assertNotNull(appProperties);
        assertEquals("Online Catalog API", appProperties.getName());
        assertEquals("1.0.0", appProperties.getVersion());
    }

}