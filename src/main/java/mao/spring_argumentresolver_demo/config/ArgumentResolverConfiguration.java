package mao.spring_argumentresolver_demo.config;

import mao.spring_argumentresolver_demo.resolver.CurrentUserMethodArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * Project name(项目名称)：spring_argumentResolver_demo
 * Package(包名): mao.spring_argumentresolver_demo.config
 * Class(类名): ArgumentResolverConfiguration
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/7
 * Time(创建时间)： 21:28
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Configuration
public class ArgumentResolverConfiguration implements WebMvcConfigurer
{
    @Override
    //注册自定义参数解析器
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers)
    {
        resolvers.add(new CurrentUserMethodArgumentResolver());
    }
}
