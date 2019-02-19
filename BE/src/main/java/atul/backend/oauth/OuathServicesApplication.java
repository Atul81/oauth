package atul.backend.oauth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;


@EnableSwagger2
@IntegrationComponentScan
@EnableIntegration
@EnableCaching
@SpringBootApplication
@PropertySource("classpath:oauthresources.properties")

public class OuathServicesApplication {

    private static final Logger log = LoggerFactory.getLogger(OuathServicesApplication.class);
    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(OuathServicesApplication.class, args);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public SecurityConfiguration securityInfo() {
        return new SecurityConfiguration(env.getProperty("gMapReportUrl"), null, null, null, "", ApiKeyVehicle.HEADER, "Authorization", "");
    }

    @Bean
    public Docket allApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("ALL Services").apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("atul.backend.oauth.controller")).paths(regex("/.*")).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Atul Backend Development").description("Developing for Learning").contact(new Contact("Atul", "http://www.nituk.ac.in", "atulkp.eee13@nituk.ac.in")).license("Licensed with Atul").version("SnapShot 1").build();
    }


}

