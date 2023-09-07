package com.br.fateczonasul;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name = "appMedia")
    public double appMedia() {
        return 6.0;
    }
}
