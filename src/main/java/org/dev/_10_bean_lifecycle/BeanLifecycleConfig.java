package org.dev._10_bean_lifecycle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.dev._10_bean_lifecycle")
@PropertySource("classpath:database-connection-config.properties") // to inject literal value dependency
public class BeanLifecycleConfig {

}
