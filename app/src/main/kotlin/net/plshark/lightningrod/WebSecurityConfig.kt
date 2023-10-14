package net.plshark.lightningrod

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain
import org.springframework.security.web.server.context.NoOpServerSecurityContextRepository

@Configuration
@EnableWebFluxSecurity
class WebSecurityConfig {
    @Bean
    fun securityFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain {
        return http
            .authorizeExchange {
                it.pathMatchers("/ambient-weather/measurements").permitAll()
                    .anyExchange().denyAll()
            }
            .securityContextRepository(NoOpServerSecurityContextRepository.getInstance())
            .csrf { it.disable() }
            .formLogin { it.disable() }
            .logout { it.disable() }
            // .httpBasic(Customizer.withDefaults())
            .build()
    }
}
