package com.uicode.tcproject.config;

import com.uicode.tcproject.entity.Exercise;
import com.uicode.tcproject.entity.User;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class MyDataRestConfig implements RepositoryRestConfigurer {

    private String theAllowedOrigins = "http://localhost:3000";
    //private String theAllowedOrigins = "https://localhost:3000";

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config,
                                                     CorsRegistry cors) {
        config.exposeIdsFor(User.class);
        config.exposeIdsFor(Exercise.class);

        /* Configure CORS Mapping */
        cors.addMapping(config.getBasePath() + "/**")
                .allowedOrigins(theAllowedOrigins);
    }
}
