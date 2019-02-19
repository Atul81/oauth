package atul.backend.oauth.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
        basePackages ={ "atul.backend.oauth.h2repository" },
        entityManagerFactoryRef = "h2EntityManager",
        transactionManagerRef = "h2TransactionManager"
)
public class H2DBConfig {

    @Bean(name = "h2DataSource")
    @ConfigurationProperties(prefix = "spring.second.datasource")
    public DataSource h2DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "h2EntityManager")
    public LocalContainerEntityManagerFactoryBean h2EntityManagerFactory(@Qualifier("h2DataSource") DataSource dataSourceI, EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(dataSourceI).packages("atul.backend.oauth.h2entity")
                .build();
    }

    @Bean(name = "h2TransactionManager")
    public PlatformTransactionManager barTransactionManager(
            @Qualifier("h2EntityManager") EntityManagerFactory
                    barEntityManagerFactory
    ) {
        return new JpaTransactionManager(barEntityManagerFactory);
    }
}