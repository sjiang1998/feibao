package cn.gzcc.feibao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Bean
    public static NoOpPasswordEncoder passwordEncoder(){
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http)throws Exception{
        http
                .formLogin()//使用表单登录界面
                .loginPage("/first1.html")  //
                .loginProcessingUrl("/doLogin")
                .defaultSuccessUrl("/doLogin")
                .failureUrl("/flogin.html?error")
                .and()
                .authorizeRequests()
                .antMatchers("/fregister.html","/doRegister", "/flogin.html", "/doLogin","/suceess.html","/first1.html","/orders","index.html","/jgxq1.html","/user1.html").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().disable();
    }

    @Override
    public void configure(WebSecurity web)throws Exception{
        web.ignoring().mvcMatchers("/css/**", "/js/**", "/img/**", "/vendors/**", "/icons/**");
    }


}
