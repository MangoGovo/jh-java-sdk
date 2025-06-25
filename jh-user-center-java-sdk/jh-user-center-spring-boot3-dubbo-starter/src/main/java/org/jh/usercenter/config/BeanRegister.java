package org.jh.usercenter.config;

import org.jh.usercenter.client.UserCenterClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MangoGovo
 */
@Configuration
public class BeanRegister {
    @Bean
    public UserCenterClient client() {
        return new UserCenterClient();
    }
}
