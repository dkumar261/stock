/**
 * 
 */
package com.stock.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author Dinesh
 *
 */
@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper mapper() {
        ModelMapper modelMapper = new ModelMapper();
        
        // Configure the ModelMapper
        modelMapper.getConfiguration()
            .setDeepCopyEnabled(true)
            .setSkipNullEnabled(true);

        return modelMapper;
    }
}