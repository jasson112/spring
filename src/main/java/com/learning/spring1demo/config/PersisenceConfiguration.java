package com.learning.spring1demo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersisenceConfiguration {
    /* HRADCOED BECAUSE IS A OVERRIDE OF THE SETTINGS only for learning propourses
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conference_app");
        builder.username("postgres");
        builder.password("root");
        System.out.println("CUSTOM DATSET INITIALIZED !!");
        return  builder.build();
    }*/
}
