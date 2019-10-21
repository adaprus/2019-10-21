package pl.javastart.restdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import pl.javastart.restdemo.interzeptor.LoggingInterceptor;

@Configuration
public class resttemplateConfig {

    @Bean
    @Autowired
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder
                .rootUri("http://localhost:8080")
                .additionalInterceptors(new LoggingInterceptor())
                .build();
    }
}
