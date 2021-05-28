package com.example.demo.bean;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JpaConfig {

    @Primary
    @Bean(name = "pruebas")
    public DataSource pruebas() {

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver ");
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/pruebas");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("241097..");
        return dataSourceBuilder.build();
    }

}
