package pl.emilia.hotelsapplication.remote.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("pl.emilia.pizza"))
                .build()
                .useDefaultResponseMessages(false)
                .ignoredParameterTypes()
                .apiInfo(new ApiInfo("Hotels information", "","","",new Contact("","","")
                        ,"","", Collections.emptyList()));

    }
}
