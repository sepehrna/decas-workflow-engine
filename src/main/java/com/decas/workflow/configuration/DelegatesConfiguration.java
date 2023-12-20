package com.decas.workflow.configuration;

import com.decas.workflow.service.ApiGatewayDelegate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DelegatesConfiguration {

    @Bean
    public ApiGatewayDelegate getApiGatewayDelegate(){
        return new ApiGatewayDelegate();
    }

}
