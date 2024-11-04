package com.anton.curso.springboot.webbapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource(/* value= */"classpath:values.properties"/* , encoding = "UTF-8" */),
	//Se pueden añadir mas ProtpertySources
})
public class ValuesConfig {

}
