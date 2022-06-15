package facturacion.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


/**
 * Swagger configuration class
 * @author Emanuel Gautero
 * @Since 0.1.0
 */

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

    /**
     * Publish a bean to generate swagger2 endpoints
     * @return a swagger configuration bean
     */
    @Bean
    public Docket usersApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(usersApiInfo())
                .select()
                .paths(userPaths())
                .apis(RequestHandlerSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }


    /**
     * Api info
     * @return ApiInfo
     */
    private ApiInfo usersApiInfo() {
        return new ApiInfoBuilder()
                .title("Service User")
                .version("1.0")
                .license("Apache License Version 2.0")
                .build();
    }


    /**
     * Config paths.
     *
     * @return the predicate
     */
    private Predicate<String> userPaths() {
        return regex("/api.*");
    }
}
