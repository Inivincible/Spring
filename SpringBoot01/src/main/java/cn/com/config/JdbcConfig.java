package cn.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zz
 */
@Configuration
public class JdbcConfig {
    @Bean
    public DataSource dataSource(){
     return  null;
    }
}
