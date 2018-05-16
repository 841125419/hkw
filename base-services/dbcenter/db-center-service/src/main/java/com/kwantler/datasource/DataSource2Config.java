package com.kwantler.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "${beichuan.basePackages:com.kwantler.mapper.beichuan}", sqlSessionTemplateRef = "beichuanSqlSessionTemplate")
public class DataSource2Config {
    @Value("${beichuan.locationPattern}")
    private String locationPattern;

    @Bean(name = "beichuanDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.beichuan")
    @Primary
    public DataSource beichuanDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "beichuanSqlSessionFactory")
    @Primary
    public SqlSessionFactory beichuanSqlSessionFactory(@Qualifier("beichuanDataSource") DataSource dataSource) throws Exception{
        System.out.println(locationPattern);
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(locationPattern));
        return bean.getObject();
    }

    @Bean(name = "beichuanTransactionManager")
    public DataSourceTransactionManager test1TransactionManager(@Qualifier("beichuanDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "beichuanSqlSessionTemplate")
    public SqlSessionTemplate test1SqlSessionTemplate(@Qualifier("beichuanSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
