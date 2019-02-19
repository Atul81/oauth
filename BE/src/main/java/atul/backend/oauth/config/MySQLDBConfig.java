package atul.backend.oauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {"atul.backend.oauth.repository"},
        entityManagerFactoryRef = "mySQLManagerFactory",
        transactionManagerRef = "mysqlTransactionManager"
)
public class MySQLDBConfig {
    @Primary
    @Bean(name = "mySQLDataSource")
    @ConfigurationProperties(prefix = "spring.first.datasource")
    public DataSource mysqlDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "mySQLManagerFactory")
    public LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory(@Qualifier("mySQLDataSource") DataSource dataSourceI, EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(dataSourceI).packages("atul.backend.oauth.entity")
                .build();
    }

    @Primary
    @Bean(name = "mysqlTransactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("mySQLManagerFactory") EntityManagerFactory
                    entityManagerFactory
    ) {
        return new JpaTransactionManager(entityManagerFactory);
    }

}