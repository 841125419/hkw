package com.kwantler.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.kwantler.mapper.test1", sqlSessionTemplateRef = "")
public class DataSource1Config {

    @Bean(name = "test1DataSource")
    @Primary
    public DataSource test1DataSource(){
        return DataSourceBuilder.create().build();
    }
}
